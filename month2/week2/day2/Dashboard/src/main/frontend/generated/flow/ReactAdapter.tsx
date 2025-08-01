/*
 * Copyright 2000-2025 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
import { createRoot, Root } from 'react-dom/client';
import { createElement, type Dispatch, type ReactElement, type ReactNode, useEffect, useReducer } from 'react';

type FlowStateKeyChangedAction<K extends string, V> = Readonly<{
    type: 'stateKeyChanged';
    key: K;
    value: V;
}>;

type FlowStateReducerAction = FlowStateKeyChangedAction<string, unknown>;

function stateReducer<S extends Readonly<Record<string, unknown>>>(state: S, action: FlowStateReducerAction): S {
    switch (action.type) {
        case 'stateKeyChanged':
            const { value } = action;
            return {
                ...state,
                key: value
            } as S;
        default:
            return state;
    }
}

type DispatchEvent<T> = T extends undefined ? () => boolean : (value: T) => boolean;

const emptyAction: Dispatch<unknown> = () => {};

/**
 * An object with APIs exposed for using in the {@link ReactAdapterElement#render}
 * implementation.
 */
export type RenderHooks = {
    /**
     * A hook API for using stateful JS properties of the Web Component from
     * the React `render()`.
     *
     * @typeParam T - Type of the state value
     *
     * @param key - Web Component property name, which is used for two-way
     * value propagation from the server and back.
     * @param initialValue - Fallback initial value (optional). Only applies if
     * the Java component constructor does not invoke `setState`.
     * @returns A tuple with two values:
     * 1. The current state.
     * 2. The `set` function for changing the state and triggering render
     * @protected
     */
    readonly useState: ReactAdapterElement['useState'];

    /**
     * A hook helper to simplify dispatching a `CustomEvent` on the Web
     * Component from React.
     *
     * @typeParam T - The type for `event.detail` value (optional).
     *
     * @param type - The `CustomEvent` type string.
     * @param options - The settings for the `CustomEvent`.
     * @returns The `dispatch` function. The function parameters change
     * depending on the `T` generic type:
     * - For `undefined` type (default), has no parameters.
     * - For other types, has one parameter for the `event.detail` value of that type.
     * @protected
     */
    readonly useCustomEvent: ReactAdapterElement['useCustomEvent'];

    /**
     * A hook helper to generate the content element with name attribute to bind
     * the server-side Flow element for this component.
     *
     * This is used together with {@link ReactAdapterComponent::getContentElement}
     * to have server-side component attach to the correct client element.
     *
     * Usage as follows:
     *
     * const content = hooks.useContent('content');
     * return <>
     *             {content}
     * </>;
     *
     * Note! Not adding the 'content' element into the dom will have the
     * server throw a IllegalStateException for element with tag name not found.
     *
     * @param name - The name attribute of the element
     */
    readonly useContent: ReactAdapterElement['useContent'];
};

interface ReadyCallbackFunction {
    (): void;
}

/**
 * A base class for Web Components that render using React. Enables creating
 * adapters for integrating React components with Flow. Intended for use with
 * `ReactAdapterComponent` Flow Java class.
 */
export abstract class ReactAdapterElement extends HTMLElement {
    #root: Root | undefined = undefined;
    #rootRendered: boolean = false;
    #rendering: ReactNode | undefined = undefined;

    #state: Record<string, unknown> = Object.create(null);
    #stateSetters = new Map<string, Dispatch<unknown>>();
    #customEvents = new Map<string, DispatchEvent<unknown>>();
    #dispatchFlowState: Dispatch<FlowStateReducerAction> = emptyAction;

    #readyCallback = new Map<string, ReadyCallbackFunction>();

    readonly #renderHooks: RenderHooks;

    readonly #Wrapper: () => ReactElement | null;

    #unmounting?: Promise<void>;

    constructor() {
        super();
        this.#renderHooks = {
            useState: this.useState.bind(this),
            useCustomEvent: this.useCustomEvent.bind(this),
            useContent: this.useContent.bind(this)
        };
        this.#Wrapper = this.#renderWrapper.bind(this);
        this.#markAsUsed();
    }

    public async connectedCallback() {
        this.#rendering = createElement(this.#Wrapper);
        const createNewRoot = this.dispatchEvent(
            new CustomEvent('flow-portal-add', {
                bubbles: true,
                cancelable: true,
                composed: true,
                detail: {
                    children: this.#rendering,
                    domNode: this
                }
            })
        );

        if (!createNewRoot || this.#root) {
            return;
        }

        await this.#unmounting;

        this.#root = createRoot(this);
        this.#maybeRenderRoot();
        this.#root.render(this.#rendering);
    }

    /**
     * Add a callback for specified element identifier to be called when
     * react element is ready.
     * <p>
     * For internal use only. May be renamed or removed in a future release.
     *
     * @param id element identifier that callback is for
     * @param readyCallback callback method to be informed on element ready state
     * @internal
     */
    public addReadyCallback(id: string, readyCallback: ReadyCallbackFunction) {
        this.#readyCallback.set(id, readyCallback);
    }

    public async disconnectedCallback() {
        if (!this.#root) {
            this.dispatchEvent(
                new CustomEvent('flow-portal-remove', {
                    bubbles: true,
                    cancelable: true,
                    composed: true,
                    detail: {
                        children: this.#rendering,
                        domNode: this
                    }
                })
            );
        } else {
            this.#unmounting = Promise.resolve();
            await this.#unmounting;
            this.#root.unmount();
            this.#root = undefined;
        }
        this.#rootRendered = false;
        this.#rendering = undefined;
    }

    /**
     * A hook API for using stateful JS properties of the Web Component from
     * the React `render()`.
     *
     * @typeParam T - Type of the state value
     *
     * @param key - Web Component property name, which is used for two-way
     * value propagation from the server and back.
     * @param initialValue - Fallback initial value (optional). Only applies if
     * the Java component constructor does not invoke `setState`.
     * @returns A tuple with two values:
     * 1. The current state.
     * 2. The `set` function for changing the state and triggering render
     * @protected
     */
    protected useState<T>(key: string, initialValue?: T): [value: T, setValue: Dispatch<T>] {
        if (this.#stateSetters.has(key)) {
            return [this.#state[key] as T, this.#stateSetters.get(key)!];
        }

        const value = ((this as Record<string, unknown>)[key] as T) ?? initialValue!;
        this.#state[key] = value;
        Object.defineProperty(this, key, {
            enumerable: true,
            get(): T {
                return this.#state[key];
            },
            set(nextValue: T) {
                this.#state[key] = nextValue;
                this.#dispatchFlowState({ type: 'stateKeyChanged', key, value });
            }
        });

        const dispatchChangedEvent = this.useCustomEvent<{ value: T }>(`${key}-changed`, { detail: { value } });
        const setValue = (value: T) => {
            this.#state[key] = value;
            dispatchChangedEvent({ value });
            this.#dispatchFlowState({ type: 'stateKeyChanged', key, value });
        };
        this.#stateSetters.set(key, setValue as Dispatch<unknown>);
        return [value, setValue];
    }

    /**
     * A hook helper to simplify dispatching a `CustomEvent` on the Web
     * Component from React.
     *
     * @typeParam T - The type for `event.detail` value (optional).
     *
     * @param type - The `CustomEvent` type string.
     * @param options - The settings for the `CustomEvent`.
     * @returns The `dispatch` function. The function parameters change
     * depending on the `T` generic type:
     * - For `undefined` type (default), has no parameters.
     * - For other types, has one parameter for the `event.detail` value of that type.
     * @protected
     */
    protected useCustomEvent<T = undefined>(type: string, options: CustomEventInit<T> = {}): DispatchEvent<T> {
        if (!this.#customEvents.has(type)) {
            const dispatch = ((detail?: T) => {
                const eventInitDict =
                    detail === undefined
                        ? options
                        : {
                            ...options,
                            detail
                        };
                const event = new CustomEvent(type, eventInitDict);
                return this.dispatchEvent(event);
            }) as DispatchEvent<T>;
            this.#customEvents.set(type, dispatch as DispatchEvent<unknown>);
            return dispatch;
        }
        return this.#customEvents.get(type)! as DispatchEvent<T>;
    }

    /**
     * The Web Component render function. To be implemented by users with React.
     *
     * @param hooks - the adapter APIs exposed for the implementation.
     * @protected
     */
    protected abstract render(hooks: RenderHooks): ReactElement | null;

    /**
     * Prepare content container for Flow to bind server Element to.
     *
     * @param name container name attribute matching server name attribute
     * @protected
     */
    protected useContent(name: string): ReactElement | null {
        useEffect(() => {
            this.#readyCallback.get(name)?.();
        }, []);
        return createElement('flow-content-container', { name, style: { display: 'contents' } });
    }

    #maybeRenderRoot() {
        if (this.#rootRendered || !this.#root) {
            return;
        }

        this.#root.render(createElement(this.#Wrapper));
        this.#rootRendered = true;
    }

    #renderWrapper(): ReactElement | null {
        const [state, dispatchFlowState] = useReducer(stateReducer, this.#state);
        this.#state = state;
        this.#dispatchFlowState = dispatchFlowState;
        return this.render(this.#renderHooks);
    }

    #markAsUsed(): void {
        // @ts-ignore
        let vaadinObject = window.Vaadin || {};
        // @ts-ignore
        if (vaadinObject.developmentMode) {
            vaadinObject.registrations = vaadinObject.registrations || [];
            vaadinObject.registrations.push({
                is: 'ReactAdapterElement',
                version: '24.8.3'
            });
        }
    }
}

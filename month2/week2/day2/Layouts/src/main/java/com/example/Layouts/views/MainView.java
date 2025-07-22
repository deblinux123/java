package com.example.Layouts.views;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;


@Route("login")
public class MainView extends VerticalLayout
{
    public MainView()
    {
        setPadding(true);
        setSpacing(true);
        setSizeFull();


        // buttons
        Button btn1 = new Button("Item 1");
        Button btn2 = new Button("Item 2");
        Button btn3 = new Button("Item 3");

        HorizontalLayout horizontalLayout = new HorizontalLayout(btn2, btn3);
        horizontalLayout.setSpacing(true);

        add(btn1, horizontalLayout);
    }    
}

package com.example.FirstPage;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class MainView extends VerticalLayout 
{
    public MainView()
    {
        Button button = new Button("Like");
        button.addClickListener(e -> button.setText("Clicked"));

        add(button);
    }
}

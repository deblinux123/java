package com.example.Dashboard.views;

import com.example.Dashboard.layout.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "sales", layout = MainLayout.class)
public class SalesView extends VerticalLayout
{
    public SalesView()
    {
        add(new H2("Sales Status"));
    }    
}

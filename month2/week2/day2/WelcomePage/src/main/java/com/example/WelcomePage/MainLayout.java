package com.example.WelcomePage;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;




public class MainLayout extends AppLayout
{
    public MainLayout()
    {
        H1 title = new H1("My App");
        title.getStyle().set("margin", "0").set("color", "#fff");

        HorizontalLayout header = new HorizontalLayout(title);
        header.getStyle().set("background", "#6200EE").set("padding", "1rem");

        addToNavbar(header);
    }    
}

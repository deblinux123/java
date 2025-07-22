package com.example.WelcomePage;


import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.button.*;
import com.vaadin.flow.component.orderedlayout.*;
import com.vaadin.flow.router.*;


@Route(value = "welcome", layout = MainLayout.class)
@PageTitle("Welcome")

public class WelcomeView  extends VerticalLayout
{
    public WelcomeView()
    {
        setAlignItems(Alignment.CENTER);
        setSpacing(true);
        setPadding(true);
        setSizeFull();
        
        H2 heading = new H2("Welcome to may App");
        Paragraph message = new Paragraph("Using vaadin for creating sweet app.");
        Button explorebtn = new Button("Start");

        add(heading, message, explorebtn);
    }    
}

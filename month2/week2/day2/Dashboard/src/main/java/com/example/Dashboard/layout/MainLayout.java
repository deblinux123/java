package com.example.Dashboard.layout;


import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;



public class MainLayout extends AppLayout
{
    public MainLayout()
    {
        createHeader();
        createSidebar();
    }    

    public void createHeader()
    {
        H1 logo = new H1("Purple Dahsboard");
        logo.getStyle().set("font-size", "1.5rem").set("margin", "0");

        HorizontalLayout header = new HorizontalLayout(logo);

        header.setWidthFull();
        header.getStyle()
        .set("background", "#f8f9fa")
        .set("padding", "1rem")
        .set("border-bottom", "1px solid #ccc");

        addToNavbar(header);
    };

    private void createSidebar() {
        RouterLink dashboard = new RouterLink("Dashboard", com.example.Dashboard.views.DashboardView.class);
        RouterLink sales = new RouterLink("Sales", com.example.Dashboard.views.SalesView.class);
        RouterLink orders = new RouterLink("Orders", com.example.Dashboard.views.OrderView.class);

        VerticalLayout sidebar = new VerticalLayout(dashboard, sales, orders);
        sidebar.getStyle()
            .set("background", "#fff")
            .set("height", "100%")
            .set("padding", "1rem")
            .set("border-right", "1px solid #ccc");

        addToDrawer(sidebar);
    }
}

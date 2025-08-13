package com.example.WeatherDashboardDemo.views;





import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("")
@PageTitle("سامانه پایش آب‌وهوا")
public class HomeView extends VerticalLayout 
{
    public HomeView() 
    {
        setSizeFull();
        setPadding(false);
        setSpacing(false);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getElement().getStyle().set("background", "linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%)");
    
    
        Header header = new Header();
        add(header);
    }
}

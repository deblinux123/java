package com.example.Dashboard.views;

import com.example.Dashboard.layout.MainLayout;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.*;
import com.vaadin.flow.router.Route;


@Route(value = "", layout = MainLayout.class)
public class DashboardView extends VerticalLayout
{    
    public DashboardView()
    {
        add(new H2("Main Dashboard"));
        Chart columnChart = new Chart(ChartType.COLUMN);
        Configuration conf = columnChart.getConfiguration();
        conf.setTitle("Visit And Sales Statistics");
        conf.addSeries(new ListSeries("USA", 10, 15, 18, 20, 24));
        conf.addSeries(new ListSeries("UK", 8, 12, 15, 17, 22));

        XAxis x = new XAxis();
        x.setCategories("Jan", "Feb", "Mar", "Apr", "May");
        conf.addxAxis(x);

        Chart pieChart = new Chart(ChartType.PIE);
        Configuration pieConf = pieChart.getConfiguration();
        pieConf.setTitle("Traffic Source");
        DataSeries series = new DataSeries();
        series.add(new DataSeriesItem("Search Engine", 30));
        series.add(new DataSeriesItem("Direct Click", 30));
        series.add(new DataSeriesItem("Bookmarks", 40));
        pieConf.setSeries(series);


        add(columnChart, pieChart);
    }
}

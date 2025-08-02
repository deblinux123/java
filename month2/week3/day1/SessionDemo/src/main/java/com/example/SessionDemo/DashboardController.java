package com.example.SessionDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController 
{
    @GetMapping("/dashboard")
    public String showDashbaord()
    {
        return "dashboard";
    }    
}

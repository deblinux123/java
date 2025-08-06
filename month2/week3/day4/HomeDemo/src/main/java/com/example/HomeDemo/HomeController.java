package com.example.HomeDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String showHomePage()
    {
        System.out.println("App Name: " + appName);
        return "home";
    }    
}

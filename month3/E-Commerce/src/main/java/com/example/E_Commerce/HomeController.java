package com.example.E_Commerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
    @GetMapping("/")
    public String showHomepage()
    {
        return "home";
    }
}

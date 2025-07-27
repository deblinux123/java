package com.example.TestingProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HomeController 
{
    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("message", "This is my first usage of thymeleaf");
        return "index";
    }
}

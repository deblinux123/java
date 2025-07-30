package com.example.demo_dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;


@Controller
public class DashboardController 
{
    @Autowired
    public UserRepository userRepository;
    
    @GetMapping("/dashboard")
    public String showDashboard(Model model)
    {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "dashboard";
    }
}

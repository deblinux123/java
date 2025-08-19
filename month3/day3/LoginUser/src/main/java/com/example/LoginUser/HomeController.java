package com.example.LoginUser;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Authentication authentication, Model model) {
        // Use getPrincipal() instead of getName()
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "home";
    }
}
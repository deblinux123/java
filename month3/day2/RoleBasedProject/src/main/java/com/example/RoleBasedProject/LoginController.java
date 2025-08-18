package com.example.RoleBasedProject;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController 
{
    @GetMapping("/login")
    public String showLogin(Authentication authentication)
    {
        if (authentication != null && authentication.isAuthenticated())
        {
            return "redirect:/";
        }

        return "login";
    }    
}

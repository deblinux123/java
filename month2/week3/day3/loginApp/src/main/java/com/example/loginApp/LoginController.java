package com.example.loginApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController 
{
    @GetMapping("/login")
    public String showLoginForm()
    {
        return "login";
    }    

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username,
                              @RequestParam String password,
                               Model model)
                               
    {
        if ("farid".equals(username))
        {
            return "redirect:/admin";
        }
        model.addAttribute("error", "Wrong username");
        return "login";
    }

    @GetMapping("/admin")
    public String showAdminPage()
    {
        return "admin";
    }

}

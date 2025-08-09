package com.example.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController 
{
    @Autowired
    private UserService userService;
    
    @GetMapping("/signup")
    public String signUpForm(Model model)
    {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute User user, Model model) 
    {
        boolean success = userService.registerUser(user);
        if (!success)
        {
            model.addAttribute("error", "این نام کاربری قبلاً ثبت شده است");
            return "signup";
        }

        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginForm(Model model)
    {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubit(@ModelAttribute User user, Model model)
    {
        boolean success = userService.loginUser(user.getUsername(), user.getPassword());

        if (!success)
        {
            model.addAttribute("error", "نام کاربری یا رمز عبور اشتباه است");
            return "login";
        }

        return "redirect:/";
    }
}

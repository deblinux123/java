package com.example.loginApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Controller
public class UserController 
{
    @GetMapping("/users")
    public String showUsers(Model model)
    {
        List<Users> users = Arrays.asList(
            new Users("ali", "ali@gmail.com", "USER"),
            new Users("farid", "farid123@gmail.com", "ADMIN"),
            new Users("babak", "babak@gmail.com", "USER")
        );

        model.addAttribute("users", users);

        return "users";
    }    
}

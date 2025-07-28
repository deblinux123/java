package com.example.TableTesting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;


@Controller
public class UserController 
{
    @GetMapping("/user")
    public String getUsers(Model model)
    {
        List<User> users = List.of(
            new User("Farid", "Farid@gmail.com"),
            new User("Asma", "Asma123@gmail.com"),
            new User("Mobina", "Mobina23@gmail.com")
        );

        model.addAttribute("users", users);

        return "users";
    }
}

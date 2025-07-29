package com.example.login_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.Optional;

@Controller
public class LoginController 
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginForm()
    {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getPassword().equals(password)) {
                model.addAttribute("message", "خوش آمدید " + user.getUsername());
                return "welcome";
            } else {
                model.addAttribute("error", "رمز عبور اشتباه است!");
                return "login";
            }
        } else {
            model.addAttribute("error", "کاربری با این نام یافت نشد!");
            return "login";
        }
    }
}

package com.example.helloworld;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // نمایش همه کاربران
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // نمایش کاربر خاص
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // افزودن کاربر جدید
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }




}

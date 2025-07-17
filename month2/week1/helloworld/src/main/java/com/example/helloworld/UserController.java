package com.example.helloworld;



import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController
{
    private final UserService service;
    
    public UserController(UserService service)
    {
        this.service = service;
    }

    @PostMapping
    public User creatUser(@RequestBody User user)
    {
        return service.savUser(user);
    }

    @GetMapping
    public User getUser(@PathVariable Long id)
    {
        return service.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        service.deleteUser(id);
    }
}

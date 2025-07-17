package com.example.helloworld;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService 
{
    private final UserRepository repository;

    public UserService(UserRepository repository)
    {
        this.repository = repository;
    }

    public User savUser(User user)
    {
        return repository.save(user);
    }

    public List<User> getAllUser() 
    {
        return repository.findAll();
    }

    public User getUserById(Long id)
    {
        return repository.findById(id).orElse(null);
    }

    public void deleteUser(Long id)
    {
        repository.deleteById(id);
    }
}
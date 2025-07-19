package com.example.testing2;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

@Service
public class UserService 
{
    
    private UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getAlUsers()
    {
        return userRepository.findAll();
    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id)
    {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id)
    {
        userRepository.deleteById(id);
    }
}

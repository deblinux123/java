package com.example.DashboardDemo;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserSevice 
{
    private final UserRepository userRepository;
    
    public UserSevice(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id)
    {
        return userRepository.findById(id);
    }

    public User savUser(User user)
    {
        return userRepository.save(user);
    }

    public void deleteUser(Integer id)
    {
        userRepository.deleteById(id);
    }

    public boolean exiexistsByUsername(String username)
    {
        return userRepository.existsByUsername(username);
    }
}

package com.example.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService 
{
    @Autowired
    private UserRepository userRepository;
    
    public boolean registerUser(User user)
    {
        if (userRepository.findByUsername(user.getUsername()).isPresent())
        {
            return false;
        }

        userRepository.save(user);
        return true;
    }

    public boolean loginUser(String username, String password)
    {
        Optional<User> userOpt = userRepository.findByUsername(username);

        if (userOpt.isEmpty())
        {
            return false;
        }

        User user = userOpt.get();

        if (user.getPassword().equals(password))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

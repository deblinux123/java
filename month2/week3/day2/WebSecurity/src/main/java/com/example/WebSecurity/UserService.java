package com.example.WebSecurity;


import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


@Service
public class UserService 
{
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User>getAllUsers()
    {
        return userRepository.findAll();
    }

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    public void deleteUserById(Long id)
    {
        userRepository.deleteById(id);
    }

    public Optional<User>getUserById(Long id)
    {
        return userRepository.findById(id);
    }
}

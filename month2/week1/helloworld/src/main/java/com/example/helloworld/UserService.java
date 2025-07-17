package com.example.helloworld;



import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UserService
{
    private final UserRepository repository;
    
    public UserService(UserRepository repository)
    {
        this.repository = repository;
    }

    public User createUser(User user)
    {
        return repository.save(user);
    }

    public List<User> getAllUsers()
    {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id)
    {
        return repository.findById(id);
    }

    public void deleteUser(Long id)
    {
        repository.deleteById(id);
    }
}

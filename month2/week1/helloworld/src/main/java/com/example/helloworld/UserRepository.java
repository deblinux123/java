package com.example.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.helloworld.User;

public interface UserRepository extends JpaRepository<User, Long>
{
    
}

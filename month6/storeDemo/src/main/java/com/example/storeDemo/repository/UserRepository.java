package com.example.storeDemo.repository;

import com.example.storeDemo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

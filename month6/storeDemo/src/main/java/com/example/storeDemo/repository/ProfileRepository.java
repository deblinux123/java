package com.example.storeDemo.repository;

import com.example.storeDemo.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}

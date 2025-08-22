package com.example.storeDemo.repository;

import com.example.storeDemo.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}

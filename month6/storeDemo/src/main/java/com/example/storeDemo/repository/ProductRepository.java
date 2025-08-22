package com.example.storeDemo.repository;

import com.example.storeDemo.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

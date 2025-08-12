package com.example.DashboardDemo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
    List<Product>findByNameContainingIgnoreCase(String name);
    List<Product>findByPriceLessThan(BigDecimal price);    
}

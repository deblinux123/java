package com.example.DashboardDemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
    List<Customer>findByNameContainingIgnoreCase(String name);    
}

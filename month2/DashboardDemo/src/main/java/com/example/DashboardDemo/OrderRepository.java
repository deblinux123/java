package com.example.DashboardDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer>
{
    List<Order>findByUserId(Integer id);
    List<Order>findByCustomerId(Integer id);    
}

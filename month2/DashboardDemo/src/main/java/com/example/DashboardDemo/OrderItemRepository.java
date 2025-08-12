package com.example.DashboardDemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>
{
    List<OrderItem>findByOrderId(Integer id);
    List<OrderItem>findByProductId(Integer id);
}

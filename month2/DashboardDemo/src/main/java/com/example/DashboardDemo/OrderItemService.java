package com.example.DashboardDemo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



@Service
public class OrderItemService 
{
    private final OrderItemRepository orderItemRepository;
    
    public OrderItemService(OrderItemRepository orderItemRepository)
    {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getAllOrderItems()
    {
        return orderItemRepository.findAll();
    }


    public Optional<OrderItem> getOrderById(Integer id)
    {
        return orderItemRepository.findById(id);
    }

    public OrderItem saveOrderItem(OrderItem orderItem)
    {
        return orderItemRepository.save(orderItem);
    }

    public void deleteOrderItem(Integer id)
    {
        orderItemRepository.deleteById(id);
    }

}

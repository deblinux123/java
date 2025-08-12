package com.example.DashboardDemo;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;




@Service
public class OrderSerivce 
{
    private final OrderRepository orderRepository;
    
    public OrderSerivce(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders()
    {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Integer id)
    {
        return orderRepository.findById(id);
    }

    public Order savvOrder(Order order)
    {
        return orderRepository.save(order);
    }

    public void deleteOrder(Integer id)
    {
        orderRepository.deleteById(id);
    }
}

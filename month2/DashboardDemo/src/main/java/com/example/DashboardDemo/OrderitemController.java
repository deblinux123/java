package com.example.DashboardDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping
public class OrderitemController 
{
    private final OrderItemService orderItemService;

    public OrderitemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> getOrderItemById(@PathVariable Integer id) {
        return orderItemService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.saveOrderItem(orderItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItem> updateOrderItem(@PathVariable Integer id, @RequestBody OrderItem orderItem) {
        return orderItemService.getOrderById(id)
                .map(existingOrderItem -> {
                    existingOrderItem.setOrder(orderItem.getOrder());
                    existingOrderItem.setProduct(orderItem.getProduct());
                    existingOrderItem.setQuantity(orderItem.getQuantity());
                    OrderItem updatedOrderItem = orderItemService.saveOrderItem(existingOrderItem);
                    return ResponseEntity.ok(updatedOrderItem);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderItem(@PathVariable Integer id) {
        if (orderItemService.getOrderById(id).isPresent()) {
            orderItemService.deleteOrderItem(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }    
}

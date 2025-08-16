package com.example.StoreApp;

import org.springframework.stereotype.Service;

@Service
public class OrderSevice {
    private final PaymentService paymentService;

    public OrderSevice(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void placeOrder()
    {
        paymentService.processPayments(10);
    }
}

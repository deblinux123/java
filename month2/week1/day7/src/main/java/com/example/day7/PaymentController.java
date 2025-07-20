package com.example.day7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController 
{
    private final PaymentService paymentService;
    
    public PaymentController(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String pay()
    {
        return paymentService.pay();
    }
}

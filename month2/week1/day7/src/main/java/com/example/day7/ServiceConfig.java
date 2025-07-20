package com.example.day7;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ServiceConfig 
{
    @Bean
    public PaymentService paymentService()
    {
        return new PaypalPaymentService();
    }    
}

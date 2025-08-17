package com.example.StoreApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
    @Value("${payment-gateway}")
    private String payment_gateway;


    @Bean
    public PaymentService stripe()
    {
        return new StripePaymentService();
    }    

    @Bean
    public PaymentService paypal()
    {
        return new PaypalPaymentService();
    }

    @Bean
    public OrderSevice order()
    {
        if (payment_gateway.equals("paypal"))
            return new OrderSevice(paypal());
        return new OrderSevice(stripe());
    }
}

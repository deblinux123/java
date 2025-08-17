package com.example.StoreApp;

// import org.springframework.context.annotation.Primary;
// import org.springframework.stereotype.Service;

// @Service
// @Primary
public class StripePaymentService implements PaymentService
{
    @Override
    public void processPayments(double amount)
    {
        System.out.println("Stripe");
        System.out.println("Amount:" + amount);
    }    
}

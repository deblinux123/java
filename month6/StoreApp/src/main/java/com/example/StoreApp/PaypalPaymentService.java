package com.example.StoreApp;

// import org.springframework.stereotype.Service;

// @Service
public class PaypalPaymentService implements PaymentService
{
    @Override
    public void processPayments(double amount)
    {
        System.out.println("Paypal");
        System.out.println("Amount:" + amount);
    }    
}

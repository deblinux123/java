package com.example.day7;

public class StripePaymentServie implements PaymentService
{
    @Override
    public String pay()
    {
        return "Stripe Payment Service";
    }    
}

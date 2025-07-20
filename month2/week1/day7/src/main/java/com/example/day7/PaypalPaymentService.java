package com.example.day7;

public class PaypalPaymentService implements PaymentService
{
    @Override
    public String pay()
    {
        return "PayPal Payment Service";
    }    
}

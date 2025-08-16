package com.example.StoreApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SMSNotification implements NotificationService
{
    @Override
    public void send(String message)
    {
        System.out.println("Sending via SMS Service.");
        System.out.println("message: " + message);
        
    }    
}

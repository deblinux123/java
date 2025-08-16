package com.example.StoreApp;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager 
{
    private final NotificationService notificationService;
    
    
    public NotificationManager(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public void notification(String message)
    {
        notificationService.send(message);
    }
}

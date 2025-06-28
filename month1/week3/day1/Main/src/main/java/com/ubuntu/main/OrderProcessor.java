/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class OrderProcessor implements Runnable
{
    private int orderId;
    public OrderProcessor(int orderId)
    {
        this.orderId = orderId;
    }
    
    public void run()
    {
        System.out.println("Processing order: #" + orderId);
        
        try
        {
            Thread.sleep(700);
        } catch (InterruptedException e)
        {
            System.out.println("Order #" + orderId + " complited.");
        }
    }
}

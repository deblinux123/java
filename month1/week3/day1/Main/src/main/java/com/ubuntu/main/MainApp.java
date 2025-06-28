/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class MainApp 
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new AlarmSystem());
        Thread t2 = new Thread(new EmailChecker());

        t1.start();
        t2.start();
        
        try
        {
            t1.join();
            t2.join();
        } catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted.");
        }
        
        System.out.println("All task finished.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class BankTransaction implements Runnable
{
    private String user;
    
    public BankTransaction(String user)
    {
        this.user = user;
    }
    
    public void run()
    {
        System.out.println(user + " Started transaction.");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println(user + " Finished transaction.");
        }
    }
}

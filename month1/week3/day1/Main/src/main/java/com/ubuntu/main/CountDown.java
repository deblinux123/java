/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class CountDown implements Runnable
{
    private int start;
    
    public CountDown(int start)
    {
        this.start = start;
    }
    
    public void run()
    {
        for (int i = start; i >= 0; i--)
        {
            System.out.println(Thread.currentThread().getName() + " => " + i);
            
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
            
        }
    }
}

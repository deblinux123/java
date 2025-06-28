/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class AlarmSystem implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Alarm: Wake up! ["+ i+ "]");
                Thread.sleep(1000);
            }
        } catch(InterruptedException e)
        {
            System.out.println("Alarm task Interrupted");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class EmailChecker implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            for (int i = 1; i <= 3; i++)
            {
                System.out.println("Checking email... [" + i + "]");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e)
        {
            System.out.println("Email Checker task Interrupted.");
        }
    }
}

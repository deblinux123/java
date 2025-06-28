/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class MyRunnable implements Runnable
{
    public void run()
    {
        for (char c = 'A'; c <= 'E'; c++)
        {
            System.out.println("Letter: " + c);
        }
    }
}

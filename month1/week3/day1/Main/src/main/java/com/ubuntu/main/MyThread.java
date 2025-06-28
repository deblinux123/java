/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class MyThread extends Thread
{
    public void run()
    {
        for (int i = 0; i<= 5; i++)
        {
            System.out.println("Number: " + i);
        }
    }
}

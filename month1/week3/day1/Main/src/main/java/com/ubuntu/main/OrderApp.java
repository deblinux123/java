/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class OrderApp 
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 3; i++)
        {
            Thread t = new Thread(new OrderProcessor(i));
            t.start();
        }
    }
}

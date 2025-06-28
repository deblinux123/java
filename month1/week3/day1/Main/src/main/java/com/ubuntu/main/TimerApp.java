/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class TimerApp
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new CountDown(20), "Timer 1");
        Thread t2 = new Thread(new CountDown(10), "Timer 2");
        
        t1.start();
        t2.start();
    }
}

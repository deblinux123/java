/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class StaticNested 
{
    private static String message = "Hello from static neste class";
    
    public static class StaticInner
        {
            public void printMessage()
            {
                System.out.println(message);
            }
        }
    
    public static void main(String[] args)
    {
        StaticNested.StaticInner inner = new StaticInner();
        inner.printMessage();
    }
}

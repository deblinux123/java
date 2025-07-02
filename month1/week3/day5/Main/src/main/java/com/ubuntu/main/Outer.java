/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Outer 
{
    private String message = "Hello This is the private message.";
    
    public class Inner
    {
        public void printMessage()
        {
            System.out.println(message);
        }
    }
    
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printMessage();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author toor
 */
public class SharedNumber 
{
    private final List<Integer> list = new ArrayList<>();
    private boolean available = false;
    
    public synchronized void addItem(int number)
    {
        while (available)
        {
            try 
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        list.add(number);
        System.out.println("Added: " + number);
        available = true;
        notifyAll();
    }
    
    public synchronized void printList()
    {
        while(!available)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        System.out.println("----- Print List -----");
        
        for (int item : list)
        {
            System.out.println(item + " ");
        }
        
        System.out.println("\n------------------------");
        available = false;
        notifyAll();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toor
 */
public class SharedList 
{
    private final List<String> list = new ArrayList<>();
    
    public synchronized void add(String value)
    {
        list.add(value);
        System.out.println("Added: " + value);
    }
    
    public synchronized void printAll()
    {
        for (String item : list)
        {
            System.out.println("Value: " + item);
        }
    }
}

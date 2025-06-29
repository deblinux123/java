/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author toor
 */
public class MessageQueue
{
    private Queue<String> queue = new LinkedList<>();
    
    private final int CAPACITY = 10;
    
    public synchronized void addMessage(String msg)
    {
        while(queue.size() >= CAPACITY)
        {
            try 
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        queue.add(msg);
        System.out.println("Produced: " + msg);
        notifyAll();
    }
    
    
    public synchronized String getMessage()
    {
        while (queue.isEmpty())
        {
            try 
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        String msg = queue.poll();
        System.out.println("Consumed: " + msg);
        notifyAll();
        return msg;
    }
}

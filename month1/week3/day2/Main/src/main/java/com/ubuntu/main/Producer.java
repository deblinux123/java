/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Producer implements Runnable
{
    private MessageQueue queue;
    
    public Producer(MessageQueue queue)
    {
        this.queue = queue;
    }
    

    @Override
    public void run()
    {
        int i = 1;
        while (i <= 5)
        {
            String msg = "Message " + i;
            queue.addMessage(msg);
            i++;
        }
        
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
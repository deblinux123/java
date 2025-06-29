/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.util.Random;
/**
 *
 * @author toor
 */
public class TestMain
{
    public static void main(String[] args)
    {
        SharedNumber myList = new SharedNumber();
        
        Thread writer = new Thread(() -> {
           Random random = new Random();
           
           while(true)
           {
               int num = random.nextInt(100);
               myList.addItem(num);
               try 
               {
                   Thread.sleep(1000);
               } catch (InterruptedException ignored){}
           }
        });
        
        Thread reader = new Thread(() -> {
           while(true)
           {
               myList.printList();
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException ignored){}
           }
        });
        
        writer.start();
        reader.start();
    }
}

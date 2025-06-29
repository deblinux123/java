/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Main {

    public static void main(String[] args) 
    {
        SharedList sharedList = new SharedList();
        
       Thread writer = new Thread(() -> {
          for (int i = 0; i<=5; i++)
          {
              sharedList.add("Item: " + i );
              try{Thread.sleep(1000);} catch (InterruptedException ignored) {}
          }
       });
       
       Thread reader = new Thread(() -> {
          try {Thread.sleep(250); } catch (InterruptedException ignored) {}
          sharedList.printAll();
       });
       
       writer.start();
       reader.start();
    }
 }

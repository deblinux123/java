/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class BankApp 
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new BankTransaction("Farid"));
        Thread t2 = new Thread(new BankTransaction("Asma"));
        
        t1.start();
        t2.start();
    }
}

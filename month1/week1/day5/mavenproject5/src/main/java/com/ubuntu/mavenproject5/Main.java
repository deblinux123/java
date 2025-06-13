/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject5;

/**
 *
 * @author toor
 */
public class Main {
    public static void main(String[] args){
        BankAccount a1 = new BankAccount("farid", "12Qe", 1200);
        a1.getAccountInfo("12Qe");
        BankAccount.printAccountCount();
        a1.getBalance("12Qe");
        System.out.println("=================");
        a1.deposit(200);
        a1.getAccountInfo("12Qe");
        a1.withdraw(100);
        a1.getAccountInfo("12Qe");
        a1.withdraw(1000);
        a1.withdraw(20000);
    }
}

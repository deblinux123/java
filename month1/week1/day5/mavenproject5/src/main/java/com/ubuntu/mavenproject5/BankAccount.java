/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject5;

/**
 *
 * @author toor
 */
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    final private String bankName = "Bank of Java";
    static int accountCount;
    
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
    }
    
    public void deposit(double amount){
        if (amount > 0){
            balance+=amount;
            System.out.println(amount + " Deposit into your account successfully.");
        }else{
            System.out.println("Invalid Amount");
        }
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " Withdraw successfully from your account");
        }else{
            System.out.println("You cant withdraw negative or more than your balance");
        }
    }
    
    void getBalance(String accountNumber){
        if (accountNumber.equals(this.accountNumber)){
            System.out.println("Balance: " + balance);
        }else{
            System.out.println("Wrong account number.");
        }
    }
    
    
    void getAccountInfo(String accountNumber){
        if(accountNumber.equals(this.accountNumber)){
            System.out.println("=============================================\n");
            System.out.println("Name: " + accountHolder + "\nAccount Number " + accountNumber + "\nBalance: " + balance);
        }else{
            System.out.println("Wrong account number");
        }
    }
    
    static void printAccountCount(){
        System.out.println("Total Account: " + accountCount);
    }
}

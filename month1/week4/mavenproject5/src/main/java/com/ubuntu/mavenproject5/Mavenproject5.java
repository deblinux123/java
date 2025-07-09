/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject5;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. ورود به حساب");
        System.out.println("2. ساخت حساب جدید");
        System.out.println("Your choice: ");
        
        int choice = Integer.parseInt(input.nextLine());
        
        System.out.println("Username: ");
        String username = input.nextLine();
        
        System.out.println("Password: ");
        String password = input.nextLine();
        
        if (choice == 1)
        {
            if (AuthService.login(username, password))
            {
                System.out.println("Login Successfully.");
                System.out.println("Do you want to delet your account (y/n)?");
                String delete = input.nextLine();
                
                if (delete.equals("y"))
                {
                    if (AccountService.deleteAccount(username))
                    {
                        System.out.println("Your account deleted.");
                    } 
                    else 
                    {
                        System.out.println("Wrong to delete your account.");
                    }
                }
                else
                {
                    System.out.println("Enter your right username and password.");
                }
            }
            else if (choice == 2)
            {
                if (RegisterService.register(username, password))
                {
                    System.out.println("Create your accunt.");
                }
                else
                {
                    System.out.println("Error acourdin.");
                }
            }
            else
            { 
                System.out.println("Invalid option.");
            }
            
            input.close();
            
        }
        
        
    }
}

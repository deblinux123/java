/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class UserInput {
    public static void main(String[] args){
        boolean isPositive = true;
        int userInput = 0;
        int sumOfPositive = 0;
        Scanner scanner = new Scanner(System.in);
        while(isPositive){
            System.out.println("Enter a Number: ");
            userInput = scanner.nextInt();
            if(userInput >= 0){
                sumOfPositive += userInput;
            }else{
                System.out.println("You Entered Negative Number.");
                isPositive = false;
            }
        }
        
        System.out.println("Sum of Positive Numbers " + sumOfPositive);
    }
}

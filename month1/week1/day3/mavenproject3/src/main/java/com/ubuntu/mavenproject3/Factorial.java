/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject3;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Factorial " + number + " is : " + result);
    }
    
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result*=i;
        }
        
        return result;
    }
}

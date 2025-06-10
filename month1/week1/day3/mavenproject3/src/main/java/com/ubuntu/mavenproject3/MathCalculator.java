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
public class MathCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        MathCalculator(number);
        int factorial = factorial(number);
        System.out.println("فاکتوریل " + factorial);
    }
    
    
    public static void MathCalculator(int number){
        System.out.println("توان دوم " + Math.pow(number, 2));
        System.out.printf("جذر%.2f \n" , Math.sqrt(number));
        System.out.println("مکعب " + Math.pow(number, 3));
    }
    
    public static int factorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result*= i;
        }
        
        return result;
    }
}

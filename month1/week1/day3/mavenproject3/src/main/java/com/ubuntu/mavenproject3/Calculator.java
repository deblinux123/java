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
public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        double a = scanner.nextDouble();
        
        System.out.println("Enter a number 2: ");
        double b = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Choose your operation (+,-,*,/)");
        String op = scanner.nextLine();
        
        double result = 0;
        
        if (op.equals("+")){
            result = add(a, b);
            System.out.println("The is the result " + result);
        }else if(op.equals("-")){
            result = subtract(a, b);
            System.out.println("This is your result " + result);
        }else if(op.equals("*")){
            result = multiply(a, b);
            System.out.println("This is your result " + result);
        }else if(op.equals("/")){
            result = divide(a, b);
            System.out.println("This is your result " + result);
        }else{
            System.out.println("Invlaid option");
        }
        
    }
    
    public static double add(double a, double b){
        double result = a + b;
        return result;
    }
    
    public static double subtract(double a, double b){
        double result = a - b;
        return result;
    }
    
    public static double multiply(double a, double b){
        double result = a * b;
        return result;
    }
    
    public static double divide(double a, double b){
        
        double result = 0;
        if(b!=0){
            result = a / b;
        }else{
            System.out.println("Error: DEivision by Zero!");
            return 0;
        }
        
        return result;
    }
}

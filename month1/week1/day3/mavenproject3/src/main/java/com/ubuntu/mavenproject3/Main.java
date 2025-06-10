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
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        
        double result = switch(op){
            case '+' -> add(a, b);
            case '-' -> subtract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            default -> {
                System.out.println("Invalid operation");
                yield 0;
            }
        };
        
        System.out.println("Result: " + result);
        
    }
    
    
    public static double add(double a, double b){
        return a + b;
    }
    
    public static double subtract(double a, double b){
        return a - b;
    }
    
    public static double multiply(double a, double b){
        return a * b;
    }
    
    public static double divide(double a, double b){
        if (b != 0){
            return a /b;
        }else{
            System.out.println("Zero Division Error");
            return 0;
        }
    }
}

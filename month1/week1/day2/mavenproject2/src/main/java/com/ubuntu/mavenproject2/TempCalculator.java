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
public class TempCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tempreture: ");
        double temp = scanner.nextDouble();
        double result = 0;
        System.out.println("You enterd: " + temp);
        
        scanner.nextLine();
        
        System.out.println("Enter the converter (c/f)");
        String converter = scanner.nextLine();
        converter = converter.toLowerCase();
        
        switch(converter){
            case "c":
                result = (temp * 9/5) + 32;
                System.out.printf("C to F: %.2f", result);
                break;
            case "f":
                result = (temp - 32) * 5/9;
                System.out.printf("F to C: %.2f", result);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

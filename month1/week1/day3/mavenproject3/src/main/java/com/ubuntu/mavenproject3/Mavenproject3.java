/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject3;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.println("Working with functions");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        int result = doubleNumber(number);
        System.out.println("This is your result: " + result);
        
        scanner.nextLine();
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        greet(name);
    }
    
    public static int doubleNumber(int num){
        return num * 2;
    }
    
    public static void greet(String name){
        System.out.println("Hello " + name);
    }
}

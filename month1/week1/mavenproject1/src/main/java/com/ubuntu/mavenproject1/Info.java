/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author toor
 */
public class Info {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = userInput.nextLine();
        
        System.out.println("Enter your age: ");
        int age = userInput.nextInt();
        
        System.out.println("Hello " + name + " and you are " + age + " years old");
    }
}

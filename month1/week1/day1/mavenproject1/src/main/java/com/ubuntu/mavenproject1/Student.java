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
public class Student {
    public static void main(String[] args){
      
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    String name = userInput.nextLine();
    
    System.out.println("Enter your Height: ");
    double height = userInput.nextDouble();
    
    System.out.println("Are you Student: (true/false)");
    boolean isStudent = userInput.nextBoolean();
    
    System.out.println("I am " + name + ", " + height + " m tall, and am i studnet? " + (isStudent?"Yes":"No"));
    
    }
    
}

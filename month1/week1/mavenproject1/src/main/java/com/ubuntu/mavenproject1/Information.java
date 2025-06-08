/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */
public class Information {
    public static void main(String[] args){
        int age = 30;
        String name = "Farid kaki";
        double height = 1.78;
        boolean isStudent = false;
        
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My height is " + height + " meters.");
        System.out.println("Am I a Student? " + isStudent);
        
        
        System.out.println("I am " + name + ", " + age + " years old, and student status " + (isStudent?"Yes":"No"));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject6;

/**
 *
 * @author toor
 */
public abstract class Animal{
    private String name;
    private int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public abstract void makeSound();
    
    public void ShowInfo(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }

}
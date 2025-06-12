/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject5;

/**
 *
 * @author toor
 */
public class Person {
    private String name;
    private int age;
    final String nationality = "Iranian";
    static int personCount;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        personCount++;
    }
        
    String getName(){
        return this.name;
    }
    
    int getAge(){
        return this.age;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\n" + "Age: " + age +"\n" + "Nationality: " + nationality;
    }
    
}

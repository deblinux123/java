/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.functionalinterface;

/**
 *
 * @author toor
 */
public class User
{
    private String name;
    private int age;
    
    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    String getName() { return name; }
    
    int getAge() { return age; }
            
}

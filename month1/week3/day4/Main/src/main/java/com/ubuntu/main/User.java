/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

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
    
    public String getName(){ return name; }
    public int getAge() {return age; }
}

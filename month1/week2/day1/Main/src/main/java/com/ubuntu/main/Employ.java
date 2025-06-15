/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Employ {
    private String name;
    private int age;
    private JobLevel jobLevel;
    private static int count;
    
    
    public Employ(String name, int age, JobLevel jobLevel)
    {
        this.name = name;
        this.age = age;
        this.jobLevel = jobLevel;
        count++;
    }
    
    public Employ(String name, int age)
    {
        this(name, age, JobLevel.JUNIOR);
    }
    
    public static int numberOfEmploy()
    {
        return count;
    }
    
    
    @Override
    public String toString()
    {
        return "Employ: " + name +
                "\nAge: " + age +
                "\nJob Level: " + jobLevel;
    }
    
}

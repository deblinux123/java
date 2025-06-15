/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class RemoteEmploy extends Employ {
    public String location;
    
    public RemoteEmploy(String name, int age, JobLevel jobLevel, String location)
    {
        super(name, age, jobLevel);
        this.location = location;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nLocation: " + location;
    }
    
}

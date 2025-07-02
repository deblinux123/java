/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Person 
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public class Address
    {
        private String city;
        private String zipcode;
        
        public Address(String city, String zipcode)
        {
            this.city = city;
            this.zipcode = zipcode;
        }
        
        public void showAddress()
        {
            System.out.println("City: " + city);
            System.out.println("Zip Code: " + zipcode);
        }
    }
    
    public void displayPersonInformation()
    {
        System.out.println("Name: " + name);
    }
}

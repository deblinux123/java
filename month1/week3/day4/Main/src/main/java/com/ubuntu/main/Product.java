/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Product
{
    private String name;
    private double price;
    
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    public String getName()  { return name; }
    public double getPrice() { return price; }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject4;

/**
 *
 * @author toor
 */
public class Car {
    private String brand;
    private String color;
    private int year;
    private double price;
    

    
    public Car(String brand, String color, int year, double price){
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    

    
    void start(){
        System.out.println(brand + " isstarting...");
    }
    
    void stop(){
        System.out.println(brand + " is stoping...");
    }
    
    void setBrand(String brand){
        this.brand = brand;
    }
    
    String getBrand(){
        return this.brand;
    }
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    void setYear(int year){
        this.year = year;
    }
    
    int getYear(){
        return this.year;
    }
    
    void setPrice(double price){
        this.price = price;
       
    }
    
    double getPrice(){
        return this.price;
    } 

}
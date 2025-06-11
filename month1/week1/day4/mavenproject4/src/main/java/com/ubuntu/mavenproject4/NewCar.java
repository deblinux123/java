/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject4;

/**
 *
 * @author toor
 */
public class NewCar {
    private String brand;
    private String color;
    private int year;
    private double price;
    
    public NewCar(String brand, String color, int year, double price){
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    
    void setBrand(String brand){
        this.brand = brand;
    }
    
    void setColor(String color){
        this.color = color;
    }
    
    void setYear(int year){
        this.year = year;
    }
    
    void setPrice(double price){
        this.price = price;
    }
    
    String getBrand(){
        return this.brand;
    }
    
    String getColor(){
        return this.color;
    }
    
    int getYear(){
        return this.year;
    }
    
    double getPrice(){
        return this.price;
    }
}

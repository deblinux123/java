/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject4;

/**
 *
 * @author toor
 */
public class Book {
    private String title;
    private String author;
    private int year;
    private double price;
    
    
    public Book(String title, String author, int year, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }
    
    String getTitle(){
        return this.title;
    }
    
    String getAuthor(){
        return this.author;
    }
    
    int getYear(){
        return this.year;
    }
    
    double getPrice(){
        return this.price;
    }
    
    @Override
    public String toString(){
        return "📘 " + title + " by " + author + " (" + year + ") - $" + price;
    }
}

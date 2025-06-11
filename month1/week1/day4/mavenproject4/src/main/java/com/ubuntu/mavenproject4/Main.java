/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject4;
import java.util.ArrayList;
/**
 *
 * @author toor
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Book> books = new ArrayList<>();
        
        books.add(new Book("Java Basics", "farid", 2020, 24.8));
        books.add(new Book("OOP in Java", "sara", 2022, 124.8));
        books.add(new Book("Advance Java", "babak", 2020, 44.8));

        for(Book book:books){
            System.out.println(book);
        }
        
    }
}

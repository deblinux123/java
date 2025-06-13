/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject6;

/**
 *
 * @author toor
 */
public class Cat extends Animal implements Movable{
    
    public Cat(String name, int age){
        super(name, age);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Cat Make Sound Meow");
    }
    
    @Override
    public void move(){
        System.out.println("Cat move");
    }
}
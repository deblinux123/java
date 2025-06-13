/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject6;

/**
 *
 * @author toor
 */
public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Dog Make Sound Wof Wof");
    }
    
    public void move(){
        System.out.println("Dog move");
    }
}

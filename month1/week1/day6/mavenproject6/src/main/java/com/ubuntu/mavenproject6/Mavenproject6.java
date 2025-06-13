/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject6;

/**
 *
 * @author toor
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        System.out.println("Inheritance");
        
        Dog dog = new Dog("jack", 3);
        dog.makeSound();
        dog.ShowInfo();
        dog.move();
        
        System.out.println("New class cat: ");
        Cat cat = new Cat("Blue", 3);
        cat.makeSound();
        cat.move();
        cat.ShowInfo();
    }
}

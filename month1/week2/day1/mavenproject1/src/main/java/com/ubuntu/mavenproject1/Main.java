/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */
public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Ali", FoodType.PIZZA, 150);
        Order o2 = new Order("Sara", FoodType.SALAD); // uses overloaded constructor

        OnlineOrder o3 = new OnlineOrder("Mina", FoodType.BURGER, 200, "Tehran - Enghelab");

        System.out.println("Order 1:");
        System.out.println(o1);
        System.out.println("\nOrder 2:");
        System.out.println(o2);
        System.out.println("\nOnline Order:");
        System.out.println(o3); // dynamic binding calls overridden getDetails()

        System.out.println("\nTotal Orders: " + Order.getOrderCount());
    }
}

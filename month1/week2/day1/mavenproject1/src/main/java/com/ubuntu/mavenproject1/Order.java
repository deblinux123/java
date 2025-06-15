/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */

public class Order {
    private String customerName;
    private FoodType food;
    private double price;
    private static int orderCount = 0;

    public Order(String customerName, FoodType food, double price) {
        this.customerName = customerName;
        this.food = food;
        this.price = price;
        orderCount++;
    }

    // Overloaded method - different parameters
    public Order(String customerName, FoodType food) {
        this(customerName, food, 100.0); // default price
    }

    public static int getOrderCount() {
        return orderCount;
    }

    public String getDetails() {
        return "Customer: " + customerName +
               "\nFood: " + food +
               "\nPrice: " + price + " Toman";
    }

    // Overridden toString()
    @Override
    public String toString() {
        return getDetails();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */
public class OnlineOrder extends Order {
    private String deliveryAddress;

    public OnlineOrder(String customerName, FoodType food, double price, String deliveryAddress) {
        super(customerName, food, price);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nDelivery: " + deliveryAddress;
    }
}


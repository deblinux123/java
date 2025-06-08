/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */
public class CurrencyConverter {
    public static void main(String[] args){
        double toman = 500000;
        double rate = 90000;
        
        double convertResult = toman / rate;
        
        System.out.printf("Dollar: %.2f\n", convertResult);
    }
}

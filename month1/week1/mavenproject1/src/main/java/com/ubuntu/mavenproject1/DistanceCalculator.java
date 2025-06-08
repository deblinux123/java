/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */
public class DistanceCalculator {
    public static void main(String[] args){
        int distance = 250;
        int avgSpeed = 90;
        double time = (double)distance / avgSpeed;
        
        System.out.println("Distance: " + distance);
        System.out.println("Average Speed: " + avgSpeed);
        System.out.printf("Time: %.2f", time);
    }
}

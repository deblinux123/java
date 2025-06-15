/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject1;

/**
 *
 * @author toor
 */

enum Day 
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Enums");
        
        Day today =  Day.MONDAY;
        
        switch(today)
        {
            case MONDAY -> System.out.println("Start of the week");
            case FRIDAY -> System.out.println("Weeken is coming");
            default -> System.out.println("MidWeek");
        }
        
        Calculator calculat = new Calculator();
        double result = calculat.add(12.0, 12.0);
        System.out.println("Result is : " + result);
        
        Cat cat = new Cat();
        cat.speak();
    }
}

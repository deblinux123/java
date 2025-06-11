/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject4;
import java.util.ArrayList;
/**
 *
 * @author toor
 */
public class Mavenproject4 {

    public static void main(String[] args){
//        Car myCar = new Car("BMW", "Black", 2020, 400);
//        
//        myCar.start();
//        myCar.stop();
//        
//        System.out.println("Brand " + myCar.getBrand());
//        System.out.println("Color " + myCar.getColor());
//        System.out.println("Year: " + myCar.getYear());
//        System.out.println("Price: " + myCar.getPrice());
        
        
        ArrayList<NewCar> listOfCar = new ArrayList<>();
        NewCar bmw = new NewCar("BMW", "Black", 2019, 345000);
        NewCar benz = new NewCar("Mercedec Benze", "White", 2022, 76500);
        NewCar ford = new NewCar("Ford", "Red", 2013, 31200);
        
        
        listOfCar.add(benz);
        listOfCar.add(bmw);
        listOfCar.add(ford);
        
        
        System.out.println("List of Cars: ");
        for(NewCar car: listOfCar){
            System.out.println(car.getBrand());
        }
        
        double hieghest = 0;
        System.out.println("Heighest Price car: ");
        for(NewCar car:listOfCar){
            if (car.getPrice() > hieghest){
                hieghest = car.getPrice();
            }
        }
        
        System.out.println("Hieghest Car is: " + hieghest);
        
        double average = 0;
        double totalPrice = 0;
        int numberOfCar = 0;
        for(NewCar car: listOfCar){
            totalPrice += car.getPrice();
            numberOfCar++;
        }
        
        average = totalPrice / numberOfCar;
        System.out.println("The average price is: " + average);
        
        
        System.out.println("Cars After 2015: ");
        for(NewCar car: listOfCar){
            if (car.getYear() > 2015){
                System.out.println("Brand " + car.getBrand() + " year " + car.getYear());
            }
        }
    }
}

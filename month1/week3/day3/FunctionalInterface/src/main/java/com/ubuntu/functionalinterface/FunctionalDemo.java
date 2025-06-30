/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.functionalinterface;
import java.util.function.*;
import java.util.Random;
/**
 *
 * @author toor
 */
public class FunctionalDemo 
{
    public static void main(String[] args)
    {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length: " + lengthFunction.apply("Lambda"));
        
        // predicate 
        Predicate<String> startWith = str -> str.startsWith("L");
        System.out.println("Start With L?: " + startWith.test("Lambda"));
        
        // consumer
        Consumer<String> printer = str -> System.out.println("Printed " + str);
        printer.accept("Hello Functional world");
        
        // supplier
        Random rand = new Random();
        
        Supplier<Double> random = () -> rand.nextDouble();
        System.out.println("Random Number is " + random.get());
        
        
                
    }
}

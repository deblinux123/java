/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.functionalinterface;
import java.util.function.*;
import java.util.*;
/**
 *
 * @author toor
 */
public class TestingUser 
{
    public static void main(String[] args)
    {
        Predicate<User> userAge = str -> str.getAge() >= 18;
        Function<User, String> toUpper = str -> str.getName().toUpperCase();
        Consumer<String> printer = str -> System.out.println("Welcome " + str);
        
        List<User> users = new ArrayList<>();
        users.add(new User("Farid", 39));
        users.add(new User("Asma", 26));
        users.add(new User("Babak", 29));
        users.add(new User("Mobina", 17));
        
        for (User name : users)
        {
            if (userAge.test(name))
            {
                String upper = toUpper.apply(name);
                printer.accept(upper);
            }
        }
        
        System.out.println("\nUse Stream api\n");
        
        users.stream().filter(userAge).map(toUpper).forEach(printer);
    }
}

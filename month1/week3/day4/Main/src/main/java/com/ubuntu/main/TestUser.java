/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
/**
 *
 * @author toor
 */
public class TestUser
{
    public static void main(String[] args)
    {
        List<User> users = new ArrayList<>();
        
        users.add(new User("Farid", 30));
        users.add(new User("Asma", 27));
        users.add(new User("Babak", 29));
        
        List<String> result = users.stream()
                .filter(user -> user.getAge() > 18)
                .map(user -> user.getName().toUpperCase())
                .collect(Collectors.toList());
        
        
        
        Function<User, String> trim      = name -> name.getName().trim();
        Function<String, String> upper   = String::toUpperCase;
        Function<String, String> addPrefix = name -> "👤>> " + name;
        
        Function<User, String> pipeline = trim.andThen(upper).andThen(addPrefix);
 
    
        result.forEach(System.out::println);
        
        System.out.println("\n");
        String newResult = pipeline.apply(users.getFirst());
        System.out.println(newResult);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.util.function.*;

/**
 *
 * @author toor
 */
public class Challenge 
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Farid");
        names.add("Asma");
        names.add("Mohammad");
        names.add("Ali");
        
        Predicate<String> longEnough = str -> str.length() >= 5;
        Function<String, String> toUpper = str -> str.toUpperCase();
        Consumer<String> printer = str -> System.out.println("Name: " + str);
        
        for (String name : names)
        {
            if (longEnough.test(name))
            {
                String upper = toUpper.apply(name);
                printer.accept(upper);
            }
        }
        
    }
}

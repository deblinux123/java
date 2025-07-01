/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author toor
 */
public class StreamTesting
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        
        for(int i = 0; i <= 5; i++)
        {
            numbers.add(random.nextInt());
        }
        
        int sum = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);
        
        System.out.println("Sum is -> " + sum);
    }
}

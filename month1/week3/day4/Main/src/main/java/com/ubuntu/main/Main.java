/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.main;
import java.util.*;
import java.util.stream.*;
/**
 *
 * @author toor
 */
public class Main {

    public static void main(String[] args)
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product("pen", 12));
        products.add(new Product("Book", 40));
        products.add(new Product("pencil", 7));
        
        
        List<String> expensive = products
                .stream()
                .filter(p -> p.getPrice() > 10)
                .map(p -> p.getName().toLowerCase())
                .collect(Collectors.toList());
        
        System.out.println(expensive);
    }
}

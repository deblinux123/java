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
public class FunctionalComposition
{
    public static void main(String[] args)
    {
        Function<String, String> trim      = String::trim;
        Function<String, String> toLower   = String::toLowerCase;
        Function<String, String> addPrefix = s -> ">> " + s;
        Function<String, String> composed = trim
                                            .andThen(toLower)
                                            .andThen(toLower)
                                            .andThen(addPrefix);
        
        String result = composed.apply(" HELLO   ");
        System.out.println(result);
        
    }
}

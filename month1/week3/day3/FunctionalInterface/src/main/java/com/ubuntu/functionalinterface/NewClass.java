/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.functionalinterface;

/**
 *
 * @author toor
 */

@FunctionalInterface
interface stringTransformer
{
    String transform(String input);
}

public class NewClass
{
    public static void main(String[] args)
    {
        stringTransformer myString = (str) -> str.toUpperCase();
        System.out.println(myString.transform("hello"));
        
        stringTransformer lower     = str -> str.toLowerCase();
        stringTransformer trim      = str -> str.trim();
        stringTransformer addPrefix = str -> ">> " + str;
        
        System.out.println("Lower: " + lower.transform("FUNCTIONAL INTERFACE"));
        System.out.println("Trim: " + trim.transform("Functional Interface"));
        System.out.println("With prefix: " + addPrefix.transform("Functional Interface"));
    }
}

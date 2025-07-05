/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;
import java.util.regex.*;
/**
 *
 * @author toor
 */
public class RegesExample 
{
    public static void main(String[] args)
    {
        String email = "exmaple@gmail.com";
        String pattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        
        boolean isValid = Pattern.matches(email, pattern);
        
        System.out.println("Is valid email? " + isValid);
    }
}

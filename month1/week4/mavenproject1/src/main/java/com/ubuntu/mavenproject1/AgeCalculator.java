/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class AgeCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your birthday date (yyyy-mm-dd)");
        String birthStr = input.nextLine();
        
        LocalDate birthDate = LocalDate.parse(birthStr);
        LocalDate today = LocalDate.now();
        
        Period age = Period.between(birthDate, today);
        
        System.out.println("Your age is : " + age.getYears() + " Years, " + age.getMonths() + " Month, and " + age.getDays() + " Days.");
    }
}

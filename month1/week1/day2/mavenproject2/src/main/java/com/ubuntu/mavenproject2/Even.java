/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject2;

import java.util.Arrays;

/**
 *
 * @author toor
 */
public class Even {
    public static void main(String[] args){
        int[] numbers = {2, 3, -5, 0, 0, 6, 4};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int sumOfPositive = 0;
        int avgPositive = 0;
        int maxNumber = 0;
        int minNumber = 0;
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                positive+=1;
                sumOfPositive += numbers[i]; 
            }
            else if (numbers[i] < 0)
                negative+=1;
            else
                zero+=1;
        }
        avgPositive = sumOfPositive / positive;
        maxNumber = numbers[numbers.length - 1];
        minNumber = numbers[0];
        
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Sum of Even number" + sumOfPositive);
        System.out.println("Average of Positive number: " + avgPositive);
        System.out.println("Min and Max Numbers are: " + minNumber + " " + maxNumber);
    }
}

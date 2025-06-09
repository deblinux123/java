/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author toor
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0){
            System.out.println("Your number is positive");
        } else if (number < 0){
            System.out.println("Your number is negative");
        } else{
            System.out.println("Your number is Zero");
        }
    }
}

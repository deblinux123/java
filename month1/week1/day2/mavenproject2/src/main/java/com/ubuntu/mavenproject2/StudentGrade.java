/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject2;

/**
 *
 * @author toor
 */
public class StudentGrade {
    public static void main(String[] args){
        char grade = 'B';
        
        switch(grade){
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Greate");
                break;
            case 'C':
                System.out.println("Good");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

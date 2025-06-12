/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject5;

/**
 *
 * @author toor
 */
public class Student {
    private String name;
    private int studentId;
    final String university = "Tehran University";
    private static int studentCount;
    
    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
        studentCount++;
    }
    
    public static void printTotalStudent(){
        System.out.println("Total Student: " + studentCount);
    }
    
    
    String getName(){
        return name;
    }
    
    int getStudentId(){
        return studentId;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\n" + "Id: " + studentId + "\n" + "University: " + university;
    }
    
}

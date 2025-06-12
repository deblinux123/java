/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject5;
import java.util.ArrayList;

/**
 *
 * @author toor
 */
public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Student> students;
    
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public void showStudents(){
        System.out.println("Student of " + name + ":");
        for(Student student:students){
            System.out.println("- " + student.getName() + " (Id: " + student.getStudentId() + ")");
        }
    }
    
    @Override
    public String toString(){
        return "Teacher: " + name + "\nSubject: " + subject;
    }
}

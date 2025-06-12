/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject5;

/**
 *
 * @author toor
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        Person person1 = new Person("Farid", 20);
        System.out.println(person1);
        System.out.println("--------------------");
        Person person2 = new Person("Asma", 39);
        System.out.println(person2);
        System.out.println("--------------------");
        System.out.println("Total person: " + Person.personCount);
        
        Student s1 = new Student("Ali", 1);
        Student s2 = new Student("Mobina", 2);
        
        System.out.println(s1);
        System.out.println(s2);
        
        Student.printTotalStudent();
    }
}

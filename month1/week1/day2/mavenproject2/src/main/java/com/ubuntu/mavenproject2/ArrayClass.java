/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject2;
import java.util.Arrays;
import java.util.ArrayList;


/**
 *
 * @author toor
 */
public class ArrayClass {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for(int i:numbers){
            System.out.println("Numbers: " + i);
        }
        
        int[] num = {23, 2, 1, 4, 3, 6, 5, 9};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
        ArrayList<String> names = new ArrayList<>();
        names.add("farid");
        names.add("Babak");
        names.addFirst("First EL");
        names.addLast("Last EL");
        
        for(String name: names){
            System.out.print(name + " ");
        }
        System.out.println();
        
        
        System.out.println("The first element in position one is: " + names.get(1));
        names.set(1, "FARID");
        System.out.println("now i change it into upper case " + names.get(1));
        
        System.out.println("Size of the array is: " + names.size());
    }
}

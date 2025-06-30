/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.functionalinterface;
import java.util.*;
/**
 *
 * @author toor
 */

@FunctionalInterface
interface Doubler
{
    int doubleIt(int x);
}


public class Main {

    public static void main(String[] args) {
        Doubler d = (x) -> x * 2;
        System.out.println("Double 5 is " + d.doubleIt(5));
        
        Runnable task = () -> System.out.println("Running in a thread...");
        new Thread(task).start();
        List<String>names = Arrays.asList("Farid", "reza", "Mobina", "Asma");
        
        names.sort((a, b) -> a.length() - b.length());
        System.out.println(names);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject2;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author toor
 */
public class ShowName {
    public static void main(String[] args){
        ArrayList<String>names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int userInput = 1;
        System.out.println("Enter 5 names: ");
        while(userInput < 6){
            System.out.println("Name " + userInput + ":");
            names.add(scanner.nextLine());
            userInput++;
        }
        
        System.out.println();
        
        System.out.println("All Names: ");
        
        for(String name: names){
            System.out.println("- " + name);
        }
        
        
        
        System.out.println("Do you want to remove a name: (yes/no)");
        
        String remove = scanner.nextLine().toLowerCase();
        
        if(remove.equals("yes")){
            System.out.println("Enter the name you want to remove: ");
            String nameForRemove = scanner.nextLine();
            if (names.contains(nameForRemove)){
                names.remove(nameForRemove);
                System.out.println(nameForRemove + " has been removed");
            }else {
                System.out.println("Name " + nameForRemove +" not found in list!.");
            }
              
        } 
          
        
        System.out.println();
        System.out.println("Final Name List: ");
        for(String name: names){
            System.out.println("- " + name);
        }
        
        
    }
}

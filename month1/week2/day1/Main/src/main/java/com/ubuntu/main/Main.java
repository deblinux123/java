/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Main {

    public static void main(String[] args) {
        Employ e1 = new Employ("Farid", 20, JobLevel.MID);
        Employ e2 = new Employ("ali", 34, JobLevel.INTERN);
        RemoteEmploy e3 = new RemoteEmploy("Asma", 27, JobLevel.MANAGER, "Karaj");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        System.out.println("\nTotal Emply: " + Employ.numberOfEmploy());
    }
}

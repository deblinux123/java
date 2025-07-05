/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject1;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author toor
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        
        LocalDateTime dateTime = LocalDateTime.now();
        
        System.out.println("Today: " + date);
        System.out.println("Current time: " + time);
        System.out.println("Date & Time: " + dateTime);
        
        LocalDate birthDay = LocalDate.of(1990, Month.MARCH, 20);
        System.out.println("Birthday: " + birthDay);
        
        LocalDate start = LocalDate.of(1999, Month.JULY, 10);
        LocalDate end = LocalDate.now();
        
        long dayBetween = ChronoUnit.DAYS.between(start, end);
        
        System.out.println("Day Pass: " + dayBetween);
    }
}

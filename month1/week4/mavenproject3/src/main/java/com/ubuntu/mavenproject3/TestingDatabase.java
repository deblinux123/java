/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject3;
import java.sql.*;
/**
 *
 * @author toor
 */
public class TestingDatabase {
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "f1309D1309@";
        
        try (Connection conn = DriverManager.getConnection(url, user, password))
        {
            System.out.println("\nConnection Successfully.\n");
            Statement stmt = conn.createStatement();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

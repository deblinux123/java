/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject5;
import java.sql.*;
/**
 *
 * @author toor
 */
public class RegisterService
{
    public static boolean register(String username, String password)
    {
        try(Connection conn = Database.connect())
        {
            String query = "INSERT INTO user (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeQuery();
            return true;
            
        } catch (SQLIntegrityConstraintViolationException e)
        {
            System.out.println("This username already have.");
            return false;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}

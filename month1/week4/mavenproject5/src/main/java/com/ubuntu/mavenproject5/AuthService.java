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
public class AuthService 
{
    public static boolean login(String username, String password)
    {
        try(Connection connect = Database.connect())
        {
            String query = "SELECT * FROM user WHERE username = ? AND PASSWORD = ?";
            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}

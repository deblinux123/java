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
public class AccountService 
{
    public static boolean deleteAccount(String username)
    {
        try(Connection conn = Database.connect())
        {
            String sql = "DELETE FROM user WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            int affected = stmt.executeUpdate();
            return affected > 0;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}

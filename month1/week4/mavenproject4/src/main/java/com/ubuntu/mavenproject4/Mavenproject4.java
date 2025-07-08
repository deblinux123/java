/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject4;
import java.sql.*;
/**
 *
 * @author toor
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        String root = "root";
        String password = "f1309D1309@";
        String url = "jdbc:mysql://localhost:3306/books";

        try (Connection conn = DriverManager.getConnection(url, root, password))
        {
            System.out.println("\nconnect into the database.\n");
            String insert = "INSERT INTO library (title, author, year) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            
            ps.setString(1, "Effective Java");
            ps.setString(2, "Joshua Bloch");
            ps.setInt(3, 2018);
            
            ps.executeUpdate();
            
            String select = "SELECT * FROM library";
            
            ResultSet rs = conn.createStatement().executeQuery(select);
            
            while(rs.next())
            {
                System.out.println(rs.getInt("id") + ": " + rs.getString("title") + ": " );
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

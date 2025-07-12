/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject1;
import java.sql.*;
/**
 *
 * @author toor
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/sensor_data_db";
        String USER = "root";
        String PASSWORD = "f1309D1309@";
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD))
        {
            System.out.println("\nconnected.\n");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from sensor_readings limit 5");
            
            System.out.println("temperature     pressure    oil_flow_rate      salt_concentration");
            while(rs.next())
            {
                
                System.out.println(rs.getInt("temperature"));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}

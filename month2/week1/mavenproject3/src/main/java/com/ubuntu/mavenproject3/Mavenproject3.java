/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject3;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class Mavenproject3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/userdb";
        String user = "root";
        String password = "f1309D1309@";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Scanner scanner = new Scanner(System.in)
        ) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            // INSERT using PreparedStatement
            String insertSql = "INSERT INTO users (name, email) VALUES (?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertSql)) {
                ps.setString(1, name);
                ps.setString(2, email);
                ps.executeUpdate();
                System.out.println("✅ User added successfully.");
            }

            // SELECT using ResultSet
            String selectSql = "SELECT * FROM users";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSql)) {

                System.out.println("\n📋 All Users:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String uname = rs.getString("name");
                    String uemail = rs.getString("email");
                    System.out.println(id + ": " + uname + " (" + uemail + ")");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

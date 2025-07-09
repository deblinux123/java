package com.ubuntu.mavenproject5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author toor
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // تنظیمات اتصال به دیتابیس
    private static final String URL = "jdbc:mysql://localhost:3306/MyApp";
    private static final String USER = "root";
    private static final String PASSWORD = "f1309D1309@";

    // متدی برای برقرار کردن اتصال
    public static Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // بارگذاری درایور MySQL
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

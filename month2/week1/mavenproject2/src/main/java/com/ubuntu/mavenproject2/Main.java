/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject2;

/**
 *
 * @author toor
 */
public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();

        // Create
        dao.addUser(new User("Ali", "ali@example.com"));

        // Read
        User user = dao.getUserById(1);
        if (user != null)
            System.out.println("User found: " + user.getName());

        // Update
        user.setName("Ali Updated");
        user.setEmail("ali.new@example.com");
        dao.updateUser(user);

        // All Users
        dao.getAllUsers().forEach(u -> System.out.println(u.getId() + ": " + u.getName()));

        // Delete
        dao.deleteUser(user.getId());
    }
}
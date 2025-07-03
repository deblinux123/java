/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.io.*;
import java.net.*;
/**
 *
 * @author toor
 */
public class UserServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Server is running... waiting for client.");

            Socket socket = server.accept();
            System.out.println("Client connected.");

            // Read message from client
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine().toUpperCase();
            System.out.println("\nClient Message: " + message);

            // Send response back to client
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("پیام شما دریافت شد\n");
            writer.flush();

            reader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;
import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author toor
 */
public class UserClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            // Send message to server
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("Enter your message to send to server: ");
            Scanner input = new Scanner(System.in);
            String message = input.nextLine();
            writer.write(message + "\n");
            writer.flush();

            // Receive response from server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = reader.readLine();
            System.out.println("Server says: " + response);

            writer.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
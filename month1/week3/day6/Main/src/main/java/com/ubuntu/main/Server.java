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
public class Server
{
    public static void main(String[] args)
    {
        try(ServerSocket server = new ServerSocket(5000))
        {
            System.out.println("Server is running... wating for client");
            
            Socket socket = server.accept();
            System.out.println("Client connected.");
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String message = reader.readLine();
            System.out.println("Client says: " + message);
            
            reader.close();
            socket.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

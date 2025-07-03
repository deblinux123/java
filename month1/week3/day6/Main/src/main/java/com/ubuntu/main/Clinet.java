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
public class Clinet
{
    public static void main(String[] args)
    {
        try(Socket socket = new Socket("localhost", 5000))
        {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            writer.write("Hello Server!\n");
            writer.flush();
            
            writer.close();
            socket.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

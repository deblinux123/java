/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class DownloadTask implements Runnable
{
    private String fileName;
    
    public DownloadTask(String fileName)
    {
        this.fileName = fileName;
    }
    
    public void run()
    {
        System.out.println("Downloading: " + fileName);
    }
}

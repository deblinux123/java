/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Threads");
        MyThread t1 = new MyThread();
        t1.start();
        
        MyRunnable r1 = new MyRunnable();
        r1.run();
        
        System.out.println("Using Thread to download the files");
        
        String[] files = {"file1.zip", "file2.zip", "file3.zip"};
        
        for (String file : files)
        {
//            Thread t = new Thread(new DownloadTask(file));
            DownloadTask t = new DownloadTask(file);
            t.run();
        }
    }
}

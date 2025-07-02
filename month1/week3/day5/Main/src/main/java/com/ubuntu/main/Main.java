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
        Class<MyClass> clazz = MyClass.class;
        
        if (clazz.isAnnotationPresent(Info.class))
        {
            Info info = clazz.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
        }
        
        new MyClass().sayHi();
        
        Class<BookClass> book = BookClass.class;
        
        if (book.isAnnotationPresent(BookInformation.class))
        {
            BookInformation bookInfo = book.getAnnotation(BookInformation.class);
            System.out.println("Author: " + bookInfo.author());
            System.out.println("Title: " + bookInfo.title());
            System.out.println("Page: " + bookInfo.page());
        }
        
        new BookClass().done();
    }
}

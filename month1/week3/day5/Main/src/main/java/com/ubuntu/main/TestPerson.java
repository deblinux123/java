/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.main;

/**
 *
 * @author toor
 */
public class TestPerson
{
    public static void main(String[] args)
    {
        Person person = new Person("Farid");
        Person.Address address = person.new Address("Tehran", "9980998");
        
        person.displayPersonInformation();
        address.showAddress();
    }
}

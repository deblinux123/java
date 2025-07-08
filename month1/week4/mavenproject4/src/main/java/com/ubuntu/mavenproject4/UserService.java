/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject4;

/**
 *
 * @author toor
 */
public class UserService 
{
    private final UserRepository repository;
    
    public UserService (UserRepository repository)
    {
        this.repository = repository;
    }
    
    public String getUserName(int id)
    {
        return repository.findNameById(id);
    }
}

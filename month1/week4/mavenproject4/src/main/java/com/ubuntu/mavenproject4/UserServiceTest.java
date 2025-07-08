/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubuntu.mavenproject4;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api;
import org.mockito.Mockito.*;
/**
 *
 * @author toor
 */
public class UserServiceTest {

    ITest
    void testGetUserName() {
        // ایجاد یک mock از interface
        UserRepository mockRepo = mock(UserRepository.class);

        // مشخص‌کردن رفتار mock
        when(mockRepo.findNameById(1)).thenReturn("Ali");

        // تزریق mock به کلاس مورد تست
        UserService service = new UserService(mockRepo);

        // تست متد
        String result = service.getUserName(1);

        assertEquals("Ali", result);
    }
}

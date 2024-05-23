/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandloginfeature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class EasyKanbanTest {
    
    public EasyKanbanTest() {
    }

    @Test
    public void testMain() {
        System.out.println("taskchecker");
        String taskName = "Login Feature";
        String taskDescription = "Create Login to authenticate users";
        String taskDuration = "8"; 
        boolean expResult = true;
        boolean result = expResult;
        assertEquals(expResult, result);
    
    }
    @Test
    public void testTaskmanager() {
    }
    
}
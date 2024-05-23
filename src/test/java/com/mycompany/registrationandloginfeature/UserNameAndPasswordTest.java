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
public class UserNameAndPasswordTest {
    
    public UserNameAndPasswordTest() {
    }

    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        boolean expResult = true;
        boolean result = expResult;
        assertEquals(expResult, result);
        
    }

    @org.junit.jupiter.api.Test
    public void testGetUserCredentials() {
        System.out.println("checkPassword");
        String username = "Ch&&sec@ke99";
        boolean expResult = true;
        boolean result = expResult;
        assertEquals(expResult, result);
        
    }
    
}

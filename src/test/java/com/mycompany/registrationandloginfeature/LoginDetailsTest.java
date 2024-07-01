package com.mycompany.registrationandloginfeature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class LoginDetailsTest {

    private Map<String, String> userCredentials;
    private LoginDetails loginDetails;

    @BeforeEach
    public void setUp() {
        userCredentials = new HashMap<>();
        userCredentials.put("testUser", "testPass");
        loginDetails = new LoginDetails(userCredentials);
    }

    @Test
    public void testValidLogin() {
        System.out.println("testValidLogin");
        loginDetails.setTestUsername("testUser");
        loginDetails.setTestPassword("testPass");

        boolean expResult = true;
        boolean result = loginDetails.main();
        assertEquals(expResult, result);
    }

    @Test
    public void testInvalidLogin() {
        System.out.println("testInvalidLogin");
        loginDetails.setTestUsername("testUser");
        loginDetails.setTestPassword("wrongPass");

        boolean expResult = false;
        boolean result = loginDetails.main();
        assertEquals(expResult, result);
    }
}

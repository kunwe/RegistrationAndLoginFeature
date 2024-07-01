/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginfeature;

import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class LoginDetails {
    private Map<String, String> userCredentials;

    public LoginDetails(Map<String, String> userCredentials) {
        this.userCredentials = userCredentials; 
    }

    public boolean main() {
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome, " + username + "!");
           TaskManager me = new TaskManager(); 
            me.addTask();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            return false;
        }
    }
}
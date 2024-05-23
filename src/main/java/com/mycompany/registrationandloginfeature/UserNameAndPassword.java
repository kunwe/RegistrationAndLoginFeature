/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginfeature;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class UserNameAndPassword {
    private Map<String, String> userCredentials;
    
    public UserNameAndPassword() {
        this.userCredentials = new HashMap<>(); //Initaialize the map
    } 
    
    public void main() {
        
        
        String username;
        String password;
        boolean myUsername = false;
        boolean myPassword = false;
        
        do{
            
            username = JOptionPane.showInputDialog("Enter a new username : (contains an underscore and is at least 5 characters in length.) ");
            password = JOptionPane.showInputDialog("Enter a password: (password contains at least 8 characters, a capital letter, a number, and a special character.) ");
            
            if (username == null || password == null){

            return;
        }

            if ( username.length() >= 6 || !username.contains("_")) {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Please ensure that your username contains an underscore and is at least 5 characters in length.");
            }else{
                JOptionPane.showMessageDialog(null, "Username successfully captured");
                // store username and password to the hashmap (userCredentials.put) 
                userCredentials.put(username, password); 
                myUsername = true;
            }

            if (password.length() < 8 && !password.matches("^(?=.[A-Z])(?=.[0-9])(?=.*[!@#$%^&()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$")) {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");   
            }else {
                JOptionPane.showMessageDialog(null, "Password successfully captured");
                myPassword = true;
            }
        }while (!myUsername || !myPassword);

        String firstName = JOptionPane.showInputDialog("Enter your First Name: ");
        String lastName = JOptionPane.showInputDialog("Enter your Last Name: ");
        
        userCredentials.put("First Name", firstName);
        userCredentials.put("Last Name", lastName);
        
        JOptionPane.showMessageDialog(null, "First Name: " + userCredentials.get("First Name") + "\nLast Name: " + userCredentials.get("Last Name"));
        
        }
        public Map<String, String> getUserCredentials() {
            return userCredentials;    
        }
}
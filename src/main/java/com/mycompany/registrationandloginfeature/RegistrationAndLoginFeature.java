/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandloginfeature;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationAndLoginFeature {
    public static void main(String[] args) {
        boolean loggedIn = false;
        UserNameAndPassword registerUser = new UserNameAndPassword(); 
        LoginDetails login = new LoginDetails(registerUser.getUserCredentials()); 

        while (!loggedIn) {
            String choice = JOptionPane.showInputDialog("Choose an option:\n1. Log in\n2. Sign up\n3. Exit");
            switch (choice) {
                case "1":
                    loggedIn = login.main();
                    break;
                case "2":
                    registerUser.main();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    loggedIn = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}
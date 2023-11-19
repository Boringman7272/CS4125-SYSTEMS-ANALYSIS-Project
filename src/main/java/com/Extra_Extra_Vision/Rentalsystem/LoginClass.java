package com.Extra_Extra_Vision.Rentalsystem;

import java.util.HashMap;
import java.util.Map;

// This is the main class for handling logins in the rental system
public class LoginClass {
    // Map to store username and passwords - In a real-world scenario, this should be replaced with a more secure system
    private Map<String, String> loginCredentials;
    
    // Constructor to initialize the LoginClass object
    public LoginClass() {
        loginCredentials = new HashMap<>();
    }

    // Method to register a new customer
    public void registerCustomer(String username, String password, CustomerClass customer) {
        // In real scenario, add validation for username and password, and encrypt password
        if (!loginCredentials.containsKey(username)) {
            loginCredentials.put(username, password);
            // Additional logic to add customer to the database or customer management system
        } else {
            throw new IllegalArgumentException("Username already exists.");
        }
    }
    
    // Method to handle customer login
    public boolean login(String username, String password) {
        // Check if username exists
        if (loginCredentials.containsKey(username)) {
            // Compare the provided password with the stored password
            return password.equals(loginCredentials.get(username));
        } else {
            return false;
        }
    }
    
    // Method to handle customer logout (Optional based on your system design)
    public void logout(String username) {
        // Logic to handle logout, like updating system logs or customer status
    }
    
    // Method to reset password - In real world, include security questions or email verification
    public void resetPassword(String username, String oldPassword, String newPassword) {
        if (loginCredentials.containsKey(username) && loginCredentials.get(username).equals(oldPassword)) {
            loginCredentials.put(username, newPassword);
        } else {
            throw new IllegalArgumentException("Invalid username or password.");
        }
    }
}


package com.Extra_Extra_Vision.Rentalsystem;

// Java's built-in ArrayList class will be used for list operations.
import java.util.ArrayList;
import java.util.List;

// This is the main class for Customer in the rental system
public class CustomerClass {
    // Attributes of the customer
    private String customerID;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String accountStatus;
    private List<String> currentRentals; // List to keep track of current rentals on customers account
    private double balance; // Customer's balance for renting

    // Constructor to initialize a Customer object
    public CustomerClass(String customerID, String name, String address, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accountStatus = "Active"; // Default status is 'Active' as if a customer class is created it should be used
        this.currentRentals = new ArrayList<>(); // Initialize the list of current rentals should be init empty
        this.balance = 0.0; // Set the balance to zero init
    }

    // Business Logic Methods
    
    // Method to check if the customer can rent items
    public boolean canRent() {
        // Customer can rent if account is active and balance is not negative
        // This is simply to be used for checks and to stop weird things like negative balances renting etc.
        return "Active".equals(accountStatus) && balance >= 0;
    }
    
    // Method to handle renting an item
    public void rentItem(String itemID) {
        if (canRent()) {
            currentRentals.add(itemID);
            // Additional logic for handling the inventory and transaction will be implemented here
            // More then likely many checks will be added to secure the process of renting
        } else {
            // Handle the scenario where the customer cannot rent items
            // THis will be something like making a request to the GUI to cause a warning or top up request to appear
        }
    }
    
    // Method to handle returning an item this is being implemented one at a time here until rent logic is complete
    // Method To allow bulk returns won't be implemented yet as I don't want to lock myself to a template just yet
    public void returnItem(String itemID) {
        if (currentRentals.contains(itemID)) {
            currentRentals.remove(itemID);
            // Additional logic for handling the inventory and transaction should be implemented here
            // Same thing as before this will require addition checks to make sure the app is working correctly
        } else {
            // Handle the scenario where the item is not part of the current rentals
        }
    }
    
    // Method to handle payment of fees
    // A basic check implemented here more to be added.
    public void payFees(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot pay a negative amount.");
        }
        balance -= amount;
    }
    
    // Accessor methods (getters) for each attribute

    // Simple enough just used for accessing stored member variables.
    // Not sure if my commenting here is excessive or not but added it for clarity in presentation
    
    // Returns the customer ID
    public String getCustomerID() {
        return customerID;
    }
    
    // Returns the customer's name
    public String getName() {
        return name;
    }
    
    // Returns the customer's address
    public String getAddress() {
        return address;
    }
    
    // Returns the customer's phone number
    public String getPhone() {
        return phone;
    }
    
    // Returns the customer's email
    public String getEmail() {
        return email;
    }
    
    // Returns the customer's account status
    public String getAccountStatus() {
        return accountStatus;
    }
    
    // Returns the list of current rentals for the customer
    public List<String> getCurrentRentals() {
        return currentRentals;
    }
    
    // Returns the customer's balance
    public double getBalance() {
        return balance;
    }
    
    // Mutator methods (setters) for attributes that should be changeable
    
    // Foundation of the Mutator methods, this is just some basic values is not completed yet 

    // Updates the account status
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    // Updates the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Validation methods
    
    // More validation checks need to be added currently this is the only one just so we can easily create customer classes
    // They will be added as needed
    // Validates the email format using a regular format
    public boolean isValidEmail(String email) {
        // Simple regex to check email format, can be improved for more stringent checks not prority right now
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
    // Update profile method
    
    // Updates the customer's profile information
    // This method might need to be inside the clerk class but I added here so Customer objects aren't set 
    public void updateProfile(String name, String address, String phone, String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    
}

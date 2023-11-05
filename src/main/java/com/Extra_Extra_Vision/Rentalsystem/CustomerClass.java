package com.Extra_Extra_Vision.Rentalsystem;

import com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer;

import scala.collection.immutable.List;

public class CustomerClass {
    // Attributes
    private String customerID;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String accountStatus;
    private List<String> currentRentals;
    private double balance;

    // Constructor
    public CustomerClass(String customerID, String name, String address, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accountStatus = "Active"; // default status
        this.currentRentals = new ArrayList_CustomFieldSerializer<>();
        this.balance = 0.0;
    }

    // Business Logic Methods
    public boolean canRent() {
        // Check if the customer's account is active and balance is non-negative
        return "Active".equals(accountStatus) && balance >= 0;
    }

    public void rentItem(String itemID) {
        if (canRent()) {
            currentRentals.add(itemID);
            // Handle inventory and transaction logic here
        } else {
            // Handle the case where the customer cannot rent
        }
    }

    public void returnItem(String itemID) {
        if (currentRentals.contains(itemID)) {
            currentRentals.remove(itemID);
            // Handle inventory and transaction logic here
        } else {
            // Handle the case where the item is not in the current rentals
        }
    }

    public void payFees(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot pay a negative amount.");
        }
        balance -= amount;
    }

     // Accessor methods (getters) for each attribute
    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public List<String> getRentalHistory() {
        return rentalHistory;
    }

    public List<String> getCurrentRentals() {
        return currentRentals;
    }

    public double getBalance() {
        return balance;
    }

    // Mutator methods (setters) for each attribute that should be changeable
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Validation methods
    public boolean isValidEmail(String email) {
        // Simple regex to check email format, can be improved as needed
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // Update profile method
    public void updateProfile(String name, String address, String phone, String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Additional methods can be added as needed
}

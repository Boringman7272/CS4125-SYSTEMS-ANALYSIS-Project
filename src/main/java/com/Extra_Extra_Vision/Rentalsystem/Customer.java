package com.Extra_Extra_Vision.Rentalsystem;

import java.util.List;

public abstract class Customer extends LoginClass {
    protected int customerID;
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    protected String accountStatus;
    protected List<String> currentRentals;
    protected double balance;
    
    // Include getters and setters here
    // ... other getters and setters
}


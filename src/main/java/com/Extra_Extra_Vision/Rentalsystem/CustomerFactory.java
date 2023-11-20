package com.Extra_Extra_Vision.Rentalsystem;

public class CustomerFactory {

    public static Customer createCustomer(String customerID, String name, String address, String phone, String email) {
        
        return new CustomerClass(customerID, name, address, phone, email);
    }
}

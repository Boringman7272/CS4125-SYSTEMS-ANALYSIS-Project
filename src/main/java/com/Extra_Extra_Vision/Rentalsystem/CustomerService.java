package com.Extra_Extra_Vision.Rentalsystem;



public interface CustomerService {
    boolean canRent(String customerID);
    void rentItem(String customerID, int itemID);
    void returnItem(String customerID, int itemID);
    void payFees(String customerID, double amount);
    CustomerClass getCustomerDetails(String customerID);
    void updateCustomerProfile(String customerID, String name, String address, double phoneNum, String email);
}

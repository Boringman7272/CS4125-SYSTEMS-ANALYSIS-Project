package com.Extra_Extra_Vision.Rentalsystem;

import com.Extra_Extra_Vision.Rentalsystem.CustomerClass;
import java.util.HashMap;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private Map<String, CustomerClass> customerMap = new HashMap<>();

    @Override
    public boolean canRent(String customerID) {
        // Customer can rent if account is active and balance is not negative
        // This is simply to be used for checks and to stop weird things like negative balances renting etc.
        
        CustomerClass customer = customerMap.get(customerID);
        return customer != null && "Active".equals(customer.getAccountStatus()) && customer.getBalance() >= 0;
    }

    @Override
    public void rentItem(String customerID, String itemID) {
        CustomerClass customer = customerMap.get(customerID);
        if (customer != null && canRent(customerID)) {
            customer.getCurrentRentals().add(itemID);
        }
    }

    @Override
    public void returnItem(String customerID, String itemID) {
        CustomerClass customer = customerMap.get(customerID);
        if (customer != null && customer.getCurrentRentals().contains(itemID)) {
            customer.getCurrentRentals().remove(itemID);
        }
    }

    @Override
    public void payFees(String customerID, double amount) {
        CustomerClass customer = customerMap.get(customerID);
        if (customer != null && amount > 0) {
            customer.setBalance(customer.getBalance() - amount);
        }
    }

    @Override
    public CustomerClass getCustomerDetails(String customerID) {
        return customerMap.get(customerID);
    }

    @Override
    public void updateCustomerProfile(String customerID, String name, String address, double phoneNum, String email) {
        CustomerClass customer = customerMap.get(customerID);
        if (customer != null) {
            customer.setName(name);
            customer.setAddress(address);
            customer.setphoneNum(phoneNum);
            customer.setEmail(email);
        }
    }
}

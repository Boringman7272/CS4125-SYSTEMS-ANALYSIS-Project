package com.Extra_Extra_Vision.Clerk;

import com.Extra_Extra_Vision.Rentalsystem.CustomerClass;
import com.Extra_Extra_Vision.Rentalsystem.DVDGame;

public class ClerkServiceImpl implements ClerkService {
    @Override
    public void setCanRent(CustomerClass customer) {
        //make states for customer class
        customer.setAccountStatus(null);
    }

    @Override
    public CustomerClass getCustomerDetails(int customerID) {
        //implement when the customer class has a method to search for a use by the accountID
        return null;
    }

    @Override
    public void updateCustomerProfile(CustomerClass customer, String name, String address, int phoneNum, String email) {
        customer.setName(name);
        customer.setAddress(address);
        customer.setphoneNum(phoneNum);
        customer.setEmail(email);
    }

    @Override
    public void addDVDGame(DVDGame dvdGame) {
        //implement when DVDgame has a db to store DVDgames
    }

    @Override
    public void removeDVDGame(DVDGame dvdGame) {
        //implement when DVDgame has a db to store DVDgames
    }
}

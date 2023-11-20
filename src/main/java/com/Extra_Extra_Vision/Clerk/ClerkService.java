package com.Extra_Extra_Vision.Clerk;

import com.Extra_Extra_Vision.Rentalsystem.CustomerClass;
import com.Extra_Extra_Vision.Rentalsystem.DVDGame;

public interface ClerkService {
    void setCanRent(CustomerClass customer);
    CustomerClass getCustomerDetails(int customerID);
    void updateCustomerProfile(CustomerClass customer, String name, String address, int phoneNum, String email);
    void addDVDGame(DVDGame dvdGame);
    void removeDVDGame(DVDGame dvdGame);
}

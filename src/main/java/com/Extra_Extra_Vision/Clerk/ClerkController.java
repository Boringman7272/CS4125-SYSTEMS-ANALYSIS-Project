package com.Extra_Extra_Vision.Clerk;

import com.Extra_Extra_Vision.Rentalsystem.AvailableState;
import com.Extra_Extra_Vision.Rentalsystem.CustomerClass;
import com.Extra_Extra_Vision.Rentalsystem.DVDGame;

public class ClerkController {
    // process a rental
    public void processRental(CustomerClass cust, DVDGame disc) {
        // TODO: DVDGame isn't implemented yet
        try {
            if (disc.getState() == new AvailableState()) {
                cust.rentItem(disc);
            }
            else {
                System.out.println("You can't rent any DVDs!!!");
                //TODO: change this once UI is implemented
            }
        }
        catch (Exception e ) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    // process a return
    public void processReturn(CustomerClass cust, DVDGame disc) {
        // TODO: DVDGame isn't implemented yet
        try {
            cust.returnItem(disc);
        }
        catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    // add a DVDGame to the list of DVDs available to rent
    public void addDvd(DVDGame disc) {
        // TODO: DVDGame isn't implemented yet
    }

    // remove a DVDGame to the list of DVDs available to rent
    public void removeDvd(DVDGame disc) {
         // TODO: DVDGame isn't implemented yet
    }
}
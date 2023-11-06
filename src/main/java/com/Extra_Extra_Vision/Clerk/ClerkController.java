package com.Extra_Extra_Vision.Clerk;

import com.Extra_Extra_Vision.Rentalsystem.CustomerClass;

public class ClerkController {
    // process a rental
    public void processRental(CustomerClass cust, DVDGame disc) {
        try {
            if (cust.canRent()) {
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
        // Will add an entry to the database containing the list of DVDs available to rent once it is implemented
    }

    // remove a DVDGame to the list of DVDs available to rent
    public void removeDvd(DVDGame disc) {
         // Will remove an entry to the database containing the list of DVDs available to rent once it is implemented
    }
}
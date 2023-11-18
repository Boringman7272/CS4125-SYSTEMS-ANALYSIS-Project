package com.Extra_Extra_Vision.Rentalsystem;

public class RentedState implements State {
    @Override
    public void markAsRented(DVDGame game) {
        // Already rented, no state change
    }

    @Override
    public void markAsAvailable(DVDGame game) {
        game.setState(new AvailableState());
        // Additional logic for marking as available
    }
}

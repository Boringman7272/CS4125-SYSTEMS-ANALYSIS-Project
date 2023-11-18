package com.Extra_Extra_Vision.Rentalsystem;

public class AvailableState implements State {
    @Override
    public void markAsRented(DVDGame game) {
        game.setState(new RentedState());
        // Additional logic for marking as rented
    }

    @Override
    public void markAsAvailable(DVDGame game) {
        // Already available, no state change
    }
}
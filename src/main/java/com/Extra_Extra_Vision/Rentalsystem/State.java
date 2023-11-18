package com.Extra_Extra_Vision.Rentalsystem;

public interface State {
    void markAsRented(DVDGame game);
    void markAsAvailable(DVDGame game);
}

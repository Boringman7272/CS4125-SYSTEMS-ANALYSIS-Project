package com.Extra_Extra_Vision.Rentalsystem;

public class DVDGameFactory {
    public static DVDGame createDVDGame(int itemID, String title, String genre, boolean available) {
        return new DVDGame(itemID, title, genre, available);
    }
}


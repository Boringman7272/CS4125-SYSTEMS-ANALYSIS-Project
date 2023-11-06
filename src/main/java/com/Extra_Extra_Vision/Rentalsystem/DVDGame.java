package com.Extra_Extra_Vision.Rentalsystem;

public class DVDGame {

    private int itemID; // Unique identifier for each DVDGame
    private String title; // Name
    private String genre; // Category
    private boolean available; // Tells us whether the game is available or rented

    // Constructor sets up the new DVDGame with initial values for itemID, title, genre, and availability.
    public DVDGame(int itemID, String title, String genre, boolean available) {
        this.itemID = itemID;
        this.title = title;
        this.genre = genre;
        this.available = available; // PLEASE NOTE: change from string to bool
                                    // need to discuss with team
    }

    // Getter for itemID
    public int getItemID() {
        return itemID;
    }

    // Setter for itemID
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter for availability status
    public boolean isAvailable() {
        return available;
    }

    // Setter for availability status
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Check if the DVDGame is available
    public boolean checkAvailability() {
        return available; // Directly returns the boolean value
    }

    // Mark the DVDGame as rented
    public void markAsRented() {
        this.available = false; // Sets available to false
    }

    // Mark the DVDGame as available
    public void markAsAvailable() {
        this.available = true; // Sets available to true
    }
}
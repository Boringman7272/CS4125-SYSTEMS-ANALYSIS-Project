package com.Extra_Extra_Vision.Rentalsystem;

public class DVDGame {

    private int itemID;
    private String title;
    private String genre;
    private String status;

    // Constructor
    public DVDGame(int itemID, String title, String genre, String status) {
        this.itemID = itemID;
        this.title = title;
        this.genre = genre;
        this.status = status;
    }

    // Getter and setter methods
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Check if the DVD game is available
    public boolean checkAvailability() {
        return "available".equalsIgnoreCase(status);
    }

    // Mark the DVD game as rented
    public void markAsRented() {
        this.status = "rented";
    }

    // Mark the DVD game as available
    public void markAsAvailable() {
        this.status = "available";
    }
}


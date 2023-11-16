package com.Extra_Extra_Vision.Rentalsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class DVDGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;
    private String title;
    private String genre;

    @Transient
    private State state;

    public DVDGame() {
        // Default constructor for JPA
    }

    public DVDGame(int itemID, String title, String genre, boolean available) {
        this.itemID = itemID;
        this.title = title;
        this.genre = genre;
        this.state = available ? new AvailableState() : new RentedState();
    }

    // Getters and setters for itemID, title, genre, and state
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void markAsRented() {
        state.markAsRented(this);
    }

    public void markAsAvailable() {
        state.markAsAvailable(this);
    }
}
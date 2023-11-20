package com.Extra_Extra_Vision.Rentalsystem;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.Extra_Extra_Vision.Rentalsystem.Observer.Subject;

import com.Extra_Extra_Vision.Rentalsystem.Observer.Observer;

@Entity
public class DVDGame implements Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;
    private String title;
    private String genre;
    private ArrayList<Observer> observers = new ArrayList<>();
    private Observer observer;

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

    //methods from Subject superclass
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(this.observer, this.itemID, this.state);
        }
    }

    @Override
    public void setAsAvailable(Observer observer, State state) {
        state.markAsAvailable(this);
    }

    @Override
    public void setAsRented(Observer observer, State state) {
        state.markAsRented(this);
    }
}
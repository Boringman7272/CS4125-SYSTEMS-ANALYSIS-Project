package com.Extra_Extra_Vision.Rentalsystem.Observer;

import com.Extra_Extra_Vision.Rentalsystem.State;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void setAsAvailable(Observer observer, State state);
    public void setAsRented(Observer observer, State state);
}

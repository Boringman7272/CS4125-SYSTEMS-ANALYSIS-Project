package com.Extra_Extra_Vision.Rentalsystem.Observer;

import com.Extra_Extra_Vision.Rentalsystem.State;

public interface Observer {
    public void update(Observer observer, int itemID, State state);
}

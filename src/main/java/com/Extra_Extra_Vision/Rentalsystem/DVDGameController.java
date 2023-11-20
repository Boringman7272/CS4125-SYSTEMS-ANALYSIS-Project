package com.Extra_Extra_Vision.Rentalsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dvdgames")
public class DVDGameController {

    @Autowired
    private DVDGameService service;

    // Endpoints for renting, returning DVD games, etc.
    // for soph
    public void markAsAvailable(Observer observer, DVDGame dvdGame) {
        dvdGame.setAsAvailable(observer, new AvailableState());
    }

    public void markAsRented(Observer observer, DVDGame dvdGame) {
        dvdGame.setAsRented(observer, new RentedState());
    }
}

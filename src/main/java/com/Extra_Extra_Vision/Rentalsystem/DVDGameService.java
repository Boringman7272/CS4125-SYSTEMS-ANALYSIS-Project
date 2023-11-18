package com.Extra_Extra_Vision.Rentalsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DVDGameService {

    @Autowired
    private DVDGameRepository repository;

    // Method to get all DVD games
    public List<DVDGame> getAllGames() {
        return repository.findAll();
    }

    // Method to get DVD games by genre
    public List<DVDGame> getGamesByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    // Method to find available DVD games
    public List<DVDGame> findAvailableDVDGames() {
        return repository.findByAvailable(true);
    }

    //rentDVDGame method
    //returnDVDGame method
}
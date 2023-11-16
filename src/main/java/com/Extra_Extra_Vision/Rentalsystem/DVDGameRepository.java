package com.Extra_Extra_Vision.Rentalsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DVDGameRepository extends JpaRepository<DVDGame, Integer> {
    // Custom query method to find DVD games by genre
    List<DVDGame> findByGenre(String genre);

    // Custom query method to find available DVD games
    List<DVDGame> findByAvailable(boolean available);
}


package com.seen.vault.model;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    
    @Id
    @GeneratedValue
    int movieId;

    String title;
    // Instant timeWatched;
    int rating;

}

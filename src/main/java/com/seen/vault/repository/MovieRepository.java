package com.seen.vault.repository;

import com.seen.vault.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    public Movie findMovieByTitle(String title);
}

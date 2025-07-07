package com.seen.vault.services;

import org.springframework.stereotype.Service;

import com.seen.vault.model.Movie;
import com.seen.vault.repository.MovieRepository;

@Service
public class MovieServices {
    MovieRepository movieRepository;

    MovieServices(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie findMovieByTitle(String title) {
        return movieRepository.findMovieByTitle(title);
    }
}

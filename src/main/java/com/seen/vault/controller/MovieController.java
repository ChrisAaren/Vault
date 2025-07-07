package com.seen.vault.controller;

import org.springframework.web.bind.annotation.RestController;

import com.seen.vault.model.Movie;
import com.seen.vault.services.MovieServices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/movie")
public class MovieController {
    MovieServices movieServices;

    MovieController(MovieServices movieServices) {
        this.movieServices = movieServices;
    }

    @PostMapping("addMovie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        Movie addedMovie = movieServices.addMovie(movie);
        return ResponseEntity.ok().body(addedMovie);
    }

    @GetMapping
    public ResponseEntity<Movie> getMovieByTitle(@RequestParam String title) {
        Movie foundMovie = movieServices.findMovieByTitle(title);
        return ResponseEntity.ok().body(foundMovie);
    }
    
}

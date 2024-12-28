package com.movierating.service;

import com.movierating.model.Movie;

import java.util.List;

public interface IMovieService {
    void addMovie(Movie movie);
    List<Movie> getMoviesByGenre(String genre);
}

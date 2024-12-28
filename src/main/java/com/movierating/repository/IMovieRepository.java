package com.movierating.repository;

import com.movierating.model.Movie;

import java.util.List;

public interface IMovieRepository {
    void addMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie getMovieByTitle(String title);
}

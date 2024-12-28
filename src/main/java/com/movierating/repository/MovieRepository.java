package com.movierating.repository;

import com.movierating.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements IMovieRepository {
    private final List<Movie> movies = new ArrayList<>();

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>(movies); // Return a copy to prevent external modification
    }

    @Override
    public Movie getMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null; // Return null if movie not found
    }
}

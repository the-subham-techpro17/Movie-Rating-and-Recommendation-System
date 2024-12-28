package com.movierating.service;

import com.movierating.model.Movie;
import com.movierating.repository.IMovieRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService implements IMovieService {
    private final IMovieRepository movieRepository;

    public MovieService(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void addMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.getAllMovies().stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .collect(Collectors.toList());  // Use Collectors.toList() instead of toList()
    }
}

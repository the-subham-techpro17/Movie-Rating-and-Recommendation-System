package com.movierating.repository;

import com.movierating.model.Rating;

import java.util.ArrayList;
import java.util.List;

public class RatingRepository {
    private List<Rating> ratings = new ArrayList<>();

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public List<Rating> getRatingsForMovie(String movieTitle) {
        List<Rating> movieRatings = new ArrayList<>();
        for (Rating rating : ratings) {
            if (rating.getMovie().getTitle().equals(movieTitle)) {
                movieRatings.add(rating);
            }
        }
        return movieRatings;
    }
}

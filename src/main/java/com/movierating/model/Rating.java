package com.movierating.model;

public class Rating {
    private User user;
    private Movie movie;
    private int rating;

    public Rating(User user, Movie movie, int rating) {
        this.user = user;
        this.movie = movie;
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getRating() {
        return rating;
    }
}

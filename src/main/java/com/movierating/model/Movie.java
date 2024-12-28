package com.movierating.model;

public class Movie {
    private String title;
    private String genre;
    private String director;

    public Movie(String title, String genre, String director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }
}

package com.movierating.ui;

import com.movierating.model.Movie;
import com.movierating.model.User;
import com.movierating.service.IMovieService;
import com.movierating.service.IUserService;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private final IMovieService movieService;
    private final IUserService userService;

    public ConsoleUI(IMovieService movieService, IUserService userService) {
        this.movieService = movieService;
        this.userService = userService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Movie Recommendation System");
            System.out.println("1. Add Movie");
            System.out.println("2. List Movies by Genre");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter movie genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter movie director: ");
                    String director = scanner.nextLine();
                    movieService.addMovie(new Movie(title, genre, director));
                    break;
                case 2:
                    System.out.print("Enter genre: ");
                    String movieGenre = scanner.nextLine();
                    List<Movie> movies = movieService.getMoviesByGenre(movieGenre);
                    movies.forEach(movie -> System.out.println(movie.getTitle()));
                    break;
                case 3:
                    return;
            }
        }
    }
}

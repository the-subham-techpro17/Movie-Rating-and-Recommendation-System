package com.movierating;

import com.movierating.repository.*;
import com.movierating.service.*;
import com.movierating.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        IMovieRepository movieRepository = new MovieRepository();
        IUserRepository userRepository = new UserRepository();
        MovieService movieService = new MovieService(movieRepository);
        UserService userService = new UserService(userRepository);

        ConsoleUI ui = new ConsoleUI(movieService, userService);
        ui.start();
    }
}

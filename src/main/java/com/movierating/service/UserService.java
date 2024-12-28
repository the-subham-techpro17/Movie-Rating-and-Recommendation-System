package com.movierating.service;

import com.movierating.model.User;
import com.movierating.repository.IUserRepository;

import java.util.List;

public class UserService implements IUserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserByUsername(String username) {
        // Assuming your repository has a method for this.
        return userRepository.getAllUsers().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null); // Return null if no user found
    }
}

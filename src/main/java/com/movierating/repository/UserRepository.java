package com.movierating.repository;

import com.movierating.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users); // Return a copy to prevent external modification
    }

    @Override
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null; // Return null if user not found
    }
}

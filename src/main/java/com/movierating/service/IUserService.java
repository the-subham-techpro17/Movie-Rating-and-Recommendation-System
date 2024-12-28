package com.movierating.service;

import com.movierating.model.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);
    List<User> getAllUsers();
    User getUserByUsername(String username); // This method needs to be implemented
}

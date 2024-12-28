package com.movierating.repository;

import com.movierating.model.User;
import java.util.List;

public interface IUserRepository {
    void addUser(User user);
    List<User> getAllUsers();
    User getUserByUsername(String username);
}

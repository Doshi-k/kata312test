package com.spasite.kata312test.service;

import com.spasite.kata312test.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser (int id);

}

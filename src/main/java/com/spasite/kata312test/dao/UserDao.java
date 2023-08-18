package com.spasite.kata312test.dao;


import com.spasite.kata312test.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser (int id);

}

package com.example.IgorWebApp20.service;

import com.example.IgorWebApp20.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User getUser(int id);

    List<User> getAllUsers();

    void deleteUser(int id);

}

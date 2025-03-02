package com.example.IgorWebApp20.service;


import com.example.IgorWebApp20.DAO.UserDAO;
import com.example.IgorWebApp20.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDAO userDAO;

    public void saveUser(User user) {
        userDAO.save(user);
    }


    public User getUser(int id) {
        return userDAO.findById(id);
    }


    public List<User> getAllUsers() {
        return userDAO.findAll();
    }


    public void deleteUser(int id) {
        userDAO.delete(id);
    }
}

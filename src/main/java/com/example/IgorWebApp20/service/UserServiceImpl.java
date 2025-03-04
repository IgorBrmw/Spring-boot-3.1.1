package com.example.IgorWebApp20.service;


import com.example.IgorWebApp20.DAO.UserDAO;
import com.example.IgorWebApp20.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Transactional
    public User getUser(int id) {
        return userDAO.findById(id);
    }

    @Transactional
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Transactional
    public void deleteUser(int id) {
        userDAO.delete(id);
    }
}

package com.ivanpolovnev.spring_security_app.service;

import com.ivanpolovnev.spring_security_app.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    public void updateUser(User user);
    void deleteUser(Long id);
    User findByUsername(String username);
}
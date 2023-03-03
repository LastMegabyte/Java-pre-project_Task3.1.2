package com.example.spring.Java.preproject_Task312.service;


import com.example.spring.Java.preproject_Task312.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    User getId(int id);

    void remove(int id);

    void update(User user);

    List<User> getAll();
}

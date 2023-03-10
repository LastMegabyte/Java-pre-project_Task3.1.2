package com.example.spring.Java.preproject_Task312.service;

import com.example.spring.Java.preproject_Task312.dao.UserDao;
import com.example.spring.Java.preproject_Task312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getId(int id) {
        return userDao.getId(id);
    }

    @Transactional
    @Override
    public void remove(int id) {
        userDao.remove(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}

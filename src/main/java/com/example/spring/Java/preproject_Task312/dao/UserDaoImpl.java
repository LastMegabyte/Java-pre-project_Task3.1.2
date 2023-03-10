package com.example.spring.Java.preproject_Task312.dao;

import com.example.spring.Java.preproject_Task312.model.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private final EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getId(int id) {
        return entityManager.createQuery("SELECT u FROM User u WHERE id = :id", User.class).setParameter("id", id).getSingleResult();
    }

    @Override
    public void remove(int id) {
        entityManager.remove(getId(id));
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}

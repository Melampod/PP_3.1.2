package com.golota.spring.springboot.spring_boot_pp31.dao;

import com.golota.spring.springboot.spring_boot_pp31.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private  EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        List<User> usersList = entityManager.createQuery("from User", User.class)
                .getResultList();
        if(usersList.isEmpty()) return null;
        return usersList;
    }

    @Override
    public void saveUser(User user) {
        User newUser = entityManager.merge(user);
        user.setId(newUser.getId());
    }

    @Override
    public User getUser(Long id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void deleteEmployee(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

}

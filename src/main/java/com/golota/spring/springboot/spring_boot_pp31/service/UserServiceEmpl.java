package com.golota.spring.springboot.spring_boot_pp31.service;


import com.golota.spring.springboot.spring_boot_pp31.dao.UserDAO;
import com.golota.spring.springboot.spring_boot_pp31.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceEmpl implements UserService { // в своих методах использует методы DAO

    private final UserDAO userDAO;

    @Autowired
    public UserServiceEmpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteEmployee(id);
    }
}

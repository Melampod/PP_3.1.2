package com.golota.spring.springboot.spring_boot_pp31.service;

import com.golota.spring.springboot.spring_boot_pp31.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User User);

    User getUser(Long id);

    void deleteUser(Long id);
}

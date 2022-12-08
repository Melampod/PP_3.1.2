package com.golota.spring.springboot.spring_boot_pp31.dao;


import com.golota.spring.springboot.spring_boot_pp31.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User User);

    User getUser(Long id);

    void deleteEmployee(Long id);
}

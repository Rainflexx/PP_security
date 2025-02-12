package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    List<User> getUsersWithRole();

    User findById(Long id);

    User findByUsername(String username);
}

package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.User;
import com.klu.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User signup(User user) {
        return repo.save(user);
    }

    public User login(String email, String password) {
        return repo.findByEmailAndPassword(email, password);
    }
}
package com.example.estate_backend.services;

import com.example.estate_backend.entities.User;
import com.example.estate_backend.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public void saveUser(User user) {
        userRepo.save(user);
    }

    public User getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }
}

package com.example.estate_backend.controllers;


import com.example.estate_backend.entities.User;
import com.example.estate_backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public  void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
}

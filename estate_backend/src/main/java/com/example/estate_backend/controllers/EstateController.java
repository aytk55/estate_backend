package com.example.estate_backend.controllers;

import com.example.estate_backend.entities.Estate;
import com.example.estate_backend.entities.User;
import com.example.estate_backend.services.EstateService;

import com.example.estate_backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estate")
public class EstateController {
    @Autowired
    private EstateService estateService;
    @Autowired
    private UserService userService;
    @PostMapping("/save/{userId}")
    public  void saveUser(@RequestBody Estate estate,@PathVariable int userId){
       User user=userService.getUserById(userId);
       estate.setUser(user);
       estateService.saveEstate(estate);
    }
    @GetMapping("/get/{id}")
    public Estate getEstateById(@PathVariable int id){
        return estateService.getEstateById(id);
    }
}

package com.example.estate_backend.services;

import com.example.estate_backend.entities.Estate;
import com.example.estate_backend.entities.User;
import com.example.estate_backend.repositories.EstateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {
    @Autowired
    private EstateRepo estateRepo;
    public void saveEstate(Estate estate) {
        estateRepo.save(estate);
    }

    public Estate getEstateById(int id) {
        return estateRepo.findById(id).orElse(null);
    }
}

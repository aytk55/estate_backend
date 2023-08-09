package com.example.estate_backend.repositories;

import com.example.estate_backend.entities.Estate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstateRepo extends JpaRepository<Estate,Integer> {
}

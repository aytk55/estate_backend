package com.example.estate_backend.repositories;

import com.example.estate_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}

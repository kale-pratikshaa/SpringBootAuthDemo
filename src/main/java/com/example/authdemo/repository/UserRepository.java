package com.example.authdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
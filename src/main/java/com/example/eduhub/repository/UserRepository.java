package com.example.eduhub.repository;

import com.example.eduhub.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, String> {
    user findByUsername(String username);
}

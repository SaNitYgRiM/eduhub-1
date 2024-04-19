package com.example.eduhub.service;

import com.example.eduhub.model.user;
import com.example.eduhub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {

        user user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}

package com.example.multi_container.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.multi_container.model.User;
import com.example.multi_container.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User getUser(long id) {
        return userRepository.findById(id)
               .orElseThrow();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}


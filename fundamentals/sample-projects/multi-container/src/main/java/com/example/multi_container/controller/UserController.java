package com.example.multi_container.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multi_container.model.User;
import com.example.multi_container.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/{id}")
    public ResponseEntity<String> greet(@PathVariable int id) {
        User user = userService.getUser(id);
        return ResponseEntity.ok().body(user.getMessage());
    }

    @PostMapping("/{message}")
    public ResponseEntity<String> addUser(@PathVariable String message) {
        User userDetail = new User();
        userDetail.setMessage(message);

        User user = userService.addUser(userDetail);
        return ResponseEntity.ok().body("User id"+user.getId());
    }
}

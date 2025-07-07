package com.seen.vault.controller;

import org.springframework.web.bind.annotation.RestController;

import com.seen.vault.model.User;
import com.seen.vault.services.UserServices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
    UserServices userServices;
    
    UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User registeredUser = userServices.createAccount(user);
        return ResponseEntity.ok().body(registeredUser);
    }

    @PostMapping("login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User loggedInUser = userServices.login(user);
        return ResponseEntity.ok().body(loggedInUser);
    }
}

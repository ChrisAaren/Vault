package com.seen.vault.services;

import org.springframework.stereotype.Service;

import com.seen.vault.model.User;
import com.seen.vault.repository.UserRepository;

@Service
public class UserServices {
    UserRepository userRepository;

    UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createAccount(User user) {
        return userRepository.save(user);
    }

    public User login(User user) {
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}

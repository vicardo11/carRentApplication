package com.carental.carrentapplication.service;

import com.carental.carrentapplication.entity.User;
import com.carental.carrentapplication.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(int userId) {
        return userRepository.findById(userId).get();
    }
}

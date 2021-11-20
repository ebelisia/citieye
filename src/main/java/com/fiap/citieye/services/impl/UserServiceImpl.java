package com.fiap.citieye.services.impl;

import com.fiap.citieye.model.User;
import com.fiap.citieye.repository.UserRepository;
import com.fiap.citieye.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

}

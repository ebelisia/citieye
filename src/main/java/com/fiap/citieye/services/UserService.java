package com.fiap.citieye.services;

import com.fiap.citieye.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUser(Long userId);
    User saveUser(User user);

}

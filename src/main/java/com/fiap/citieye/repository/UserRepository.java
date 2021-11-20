package com.fiap.citieye.repository;

import com.fiap.citieye.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}

package com.hariharan.springsecdemo.dao;

import com.hariharan.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}

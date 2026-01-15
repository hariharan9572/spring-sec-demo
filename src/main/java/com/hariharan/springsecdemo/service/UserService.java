package com.hariharan.springsecdemo.service;

import com.hariharan.springsecdemo.dao.UserRepo;
import com.hariharan.springsecdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }

}

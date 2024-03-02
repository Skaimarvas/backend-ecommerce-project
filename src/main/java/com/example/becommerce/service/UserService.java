package com.example.becommerce.service;

import com.example.becommerce.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findByid(long id);
    User save(User user);
    User remove(long id);


}

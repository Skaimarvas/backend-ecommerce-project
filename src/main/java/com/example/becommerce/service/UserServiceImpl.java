package com.example.becommerce.service;

import com.example.becommerce.entity.User;
import com.example.becommerce.repository.UserRepository;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByid(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            return user;
        }
        return  null;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User remove(long id) {
        User user = findByid(id);
        if(user != null){
            userRepository.delete(user);
        }
        return null;
    }
}

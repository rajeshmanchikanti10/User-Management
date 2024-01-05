package com.rajesh.validation_Exception.service;

import com.rajesh.validation_Exception.dto.UserRequest;
import com.rajesh.validation_Exception.entity.User;
import com.rajesh.validation_Exception.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User  saveUser(UserRequest userRequest){
        return userRepository.save(UserRequest.toDTO(userRequest));
    }
    public User getUser(int id){
        return userRepository.findByUserId(id);
    }
}

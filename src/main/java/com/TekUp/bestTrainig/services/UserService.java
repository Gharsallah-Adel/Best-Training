package com.TekUp.bestTrainig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.TekUp.bestTrainig.entities.User;
import com.TekUp.bestTrainig.repositories.UserRepository;

@Service
@Configuration

public class UserService {
	
	@Autowired
    UserRepository userRepository;

    public User addUser(User user) {

        return userRepository.save(user);
    }

    //Get
    public List<User> getAllUser() {

        return (List<User>) userRepository.findAll();
    }

    //get by id

    public Optional<User> getById(int id) {

        return (Optional<User>) userRepository.findById(id);
    }

    // delete
    public void deleteUserById(int user_id) {
        userRepository.delete(userRepository.findById(user_id).get());

    }

    //Update
    public User updateUser(User user, int user_id) {
        User us = userRepository.findById(user_id).get();

        user.setUser_id(us.getUser_id());

        userRepository.save(user);
        return user;
    }



}


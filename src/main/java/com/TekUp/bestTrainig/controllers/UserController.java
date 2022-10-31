package com.TekUp.bestTrainig.controllers;
import java.util.List;
import com.TekUp.bestTrainig.entities.User;
import com.TekUp.bestTrainig.services.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/USER")

public class UserController {
	
	@Autowired
    UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);


    }

    @GetMapping("/AllUsers")
    public List<User> retrieveAllUsers() {
        List<User> list = userService.getAllUser();
        return list;

    }

    @GetMapping("/byid/{user_id}")
    public Optional<User> getById(@PathVariable("user_id") int user_id) {
        Optional<User> list = userService.getById(user_id);
        return list;

    }

    @DeleteMapping("/remove-User/{user_id}")
    public void removeUser(@PathVariable("user_id") int user_id) {
        userService.deleteUserById(user_id);

    }
        @PutMapping("/modify-User/{user_id}")
        public User modifyFurniture(@RequestBody User user,@PathVariable("user_id")int user_id) {
            return userService.updateUser(user, user_id);
        }




}

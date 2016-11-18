package com.beegework.experimentation.krrideshare.controller;

import com.beegework.experimentation.krrideshare.model.User;
import com.beegework.experimentation.krrideshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by thebeege on 11/15/16.
 */
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    // Create
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User newUser(@RequestBody User user) {
        System.out.println("user:" + user.toString());
        return saveUser(user);
    }

    // Read
    @RequestMapping(value = "/user/{userID}")
    public User getUser(@PathVariable Long userID) {
        return userService.getUserByID(userID); // I _think_ Spring will parse the user properly
    }

    // Read all
    @RequestMapping(value = "/user")
    public Iterable<User> getAllUsers() {
        return userService.listAllUsers();
    }

    // Update
    // TODO: Figure out how best to do this without View described by tutorial https://springframework.guru/spring-boot-web-application-part-4-spring-mvc/
    @RequestMapping(value = "/user/{userID}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable Long userID, @RequestBody User user) {
        user.setUserID(userID);
        return saveUser(user);
    }

    // Delete
    @RequestMapping(value = "/user/{userID}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long userID) {
        userService.deleteUser(userID);
        return "redirect:/user";
    }

    public User saveUser(User user) {
        return userService.saveUser(user);
    }
}

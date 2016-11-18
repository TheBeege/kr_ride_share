package com.beegework.experimentation.krrideshare.service;

import com.beegework.experimentation.krrideshare.model.User;

/**
 * Created by thebeege on 11/18/16.
 */
public interface UserService {
    Iterable<User> listAllUsers();

    User getUserByID(Long userID);

    User saveUser(User user);

    void deleteUser(Long userID);
}

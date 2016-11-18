package com.beegework.experimentation.krrideshare.service;

import com.beegework.experimentation.krrideshare.model.User;
import com.beegework.experimentation.krrideshare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by thebeege on 11/18/16.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByID(Long userID) {
        return userRepository.findOne(userID);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userID) {
        userRepository.delete(userID);
    }
}

package com.beegework.experimentation.krrideshare.service;

import com.beegework.experimentation.krrideshare.model.User;
import com.beegework.experimentation.krrideshare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by thebeege on 11/18/16.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

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

    // This gives us the merge behavior we expect when saving a user with an ID already
    public User saveUser(User user) {
        if (user.getUserID() == null) {
            entityManager.persist(user);
            return user;
        } else {
            return entityManager.merge(user);
        }
    }

    public void deleteUser(Long userID) {
        userRepository.delete(userID);
    }
}

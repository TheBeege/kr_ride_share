package com.beegework.experimentation.krrideshare.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by thebeege on 11/2/16.
 */
@Entity
public class User {

    private static final Logger log = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue
    private long userID;

    private String familyName, givenName, photoURL;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public User(String familyName, String givenName, String photoURL) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.photoURL = photoURL;
    }
    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public long getUserID() {
        return userID;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    @Override
    public String toString() {
        return String.format("User[userID=%d, familyName='%s', givenName='%s']", userID, familyName, givenName);
    }
}

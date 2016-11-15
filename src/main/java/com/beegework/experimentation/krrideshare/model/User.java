package com.beegework.experimentation.krrideshare.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by thebeege on 11/2/16.
 */
public class User {

    private static final Logger log = LoggerFactory.getLogger(User.class);

    private long userID;

    private String familyName, givenName, photoURL;

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

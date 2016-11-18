package com.beegework.experimentation.krrideshare.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by thebeege on 11/2/16.
 */
@Entity
public class User implements java.io.Serializable {

    private static final Logger log = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;

    private String familyName, givenName, photoURL;

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

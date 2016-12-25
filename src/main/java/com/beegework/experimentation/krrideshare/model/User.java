package com.beegework.experimentation.krrideshare.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * Created by thebeege on 11/2/16.
 */
@Entity
@Table(name = "`user`") // user is a reserved word in psql
public class User implements java.io.Serializable {

    private static final Logger log = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_user_id_seq")
    @SequenceGenerator(name="user_user_id_seq", sequenceName="user_user_id_seq", allocationSize=1)
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "family_name")
    private String familyName;

    @Column(name = "given_name")
    private String givenName;

    @Column(name = "photo_url")
    private String photoURL;

    @Column(name = "is_driver")
    private boolean isDriver;

    @OneToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
    private Vehicle vehicle;

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return String.format("User[userID=%d, familyName='%s', givenName='%s']", userID, familyName, givenName);
    }
}

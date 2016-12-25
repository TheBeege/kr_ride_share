package com.beegework.experimentation.krrideshare.model;

import javax.persistence.*;

/**
 * Created by thebeege on 11/20/16.
 */
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle_vehicle_id_seq")
    @SequenceGenerator(name="vehicle_vehicle_id_seq", sequenceName="vehicle_vehicle_id_seq", allocationSize=1)
    @Column(name = "vehicle_id")
    private Long vehicleID;

    private String make, model, plate;
    private int year;

    @OneToOne(mappedBy = "vehicle")
    private User user;

    public Long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID=" + vehicleID +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }
}

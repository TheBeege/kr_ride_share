package com.beegework.experimentation.krrideshare.service;

import com.beegework.experimentation.krrideshare.model.Vehicle;

/**
 * Created by thebeege on 12/25/16.
 */
public interface VehicleService {
    Vehicle getVehicleByID(Long vehicleID);

    Vehicle saveVehicle(Vehicle vehicle);

    void deleteVehicle(Long vehicleID);
}

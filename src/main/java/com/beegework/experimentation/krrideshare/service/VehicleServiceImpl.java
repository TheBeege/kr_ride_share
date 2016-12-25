package com.beegework.experimentation.krrideshare.service;

import com.beegework.experimentation.krrideshare.model.Vehicle;
import com.beegework.experimentation.krrideshare.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by thebeege on 12/25/16.
 */
@Service
public class VehicleServiceImpl implements VehicleService{

    private VehicleRepository vehicleRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public void setVehicleRepository(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicleByID(Long vehicleID) {
        return vehicleRepository.findOne(vehicleID);
    }

    @Transactional
    public Vehicle saveVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleID() == null) {
            entityManager.persist(vehicle);
            return vehicle;
        } else {
            return entityManager.merge(vehicle);
        }
    }

    public void deleteVehicle(Long vehicleID) {
        vehicleRepository.delete(vehicleID);
    }
}

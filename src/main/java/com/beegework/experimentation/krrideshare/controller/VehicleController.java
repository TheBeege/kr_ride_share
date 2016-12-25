package com.beegework.experimentation.krrideshare.controller;

import com.beegework.experimentation.krrideshare.model.Vehicle;
import com.beegework.experimentation.krrideshare.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by thebeege on 12/25/16.
 */
@RestController
public class VehicleController {

    private VehicleService vehicleService;

    @Autowired
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // Create
    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public Vehicle newVehicle(@RequestBody Vehicle vehicle) {
        return saveVehicle(vehicle);
    }

    // Read
    @RequestMapping(value = "/vehicle/{vehicleID}")
    public Vehicle getVehicle(@PathVariable Long vehicleID) {
        return vehicleService.getVehicleByID(vehicleID);
    }

    // Update
    @RequestMapping(value = "/vehicle/{vehicleID}", method = RequestMethod.PUT)
    public Vehicle updateVehicle(@PathVariable Long vehicleID, @RequestBody Vehicle vehicle) {
        vehicle.setVehicleID(vehicleID);
        return saveVehicle(vehicle);
    }

    // Delete
    @RequestMapping(value = "/vehicle/{vehicleID}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long vehicleID) {
        vehicleService.deleteVehicle(vehicleID);
        return "redirect:/vehicle/" + vehicleID;
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }
}

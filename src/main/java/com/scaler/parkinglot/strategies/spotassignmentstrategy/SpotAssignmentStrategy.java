package com.scaler.parkinglot.strategies.spotassignmentstrategy;

import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.ParkingSpot;
import com.scaler.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {

    ParkingSpot getSpot(Gate gate, VehicleType vehicleType);
}

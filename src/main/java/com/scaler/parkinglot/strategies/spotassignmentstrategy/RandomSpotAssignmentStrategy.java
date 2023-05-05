package com.scaler.parkinglot.strategies.spotassignmentstrategy;

import com.scaler.parkinglot.models.*;
import com.scaler.parkinglot.repositories.ParkingLotRepository;

public class RandomSpotAssignmentStrategy
implements SpotAssignmentStrategy {
    private ParkingLotRepository parkingLotRepository;

    public RandomSpotAssignmentStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotForGate(
                gate
        );

        for (ParkingFloor parkingFloor: parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot: parkingFloor.getParkingSpots()) {
                if (parkingSpot.getSupportedVehicleTypes().contains(vehicleType) &&
                parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}

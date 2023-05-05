package com.scaler.parkinglot.strategies.spotassignmentstrategy;

import com.scaler.parkinglot.models.SpotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotForType(
            SpotAssignmentStrategyType type) {
        return new RandomSpotAssignmentStrategy();
    }
}

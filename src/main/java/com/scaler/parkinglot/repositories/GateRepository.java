package com.scaler.parkinglot.repositories;

import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
//  private Database database;
    private Map<Long, Gate> gates = new TreeMap<>();

    public Optional<Gate> findGateById(Long id) {
    //
        //  database.execute("select * from gate ")
        if (gates.containsKey(id)) {
            return Optional.of(gates.get(id));
        }

        return Optional.empty();
    }
}

// Optional <Gate>
// Optional is like a wrapper over an object
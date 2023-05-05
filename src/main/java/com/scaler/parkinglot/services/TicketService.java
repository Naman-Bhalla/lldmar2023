package com.scaler.parkinglot.services;

import com.scaler.parkinglot.exceptions.GateNotFoundException;
import com.scaler.parkinglot.models.*;
import com.scaler.parkinglot.repositories.GateRepository;
import com.scaler.parkinglot.repositories.ParkingLotRepository;
import com.scaler.parkinglot.repositories.TicketRepository;
import com.scaler.parkinglot.repositories.VehicleRepository;
import com.scaler.parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;
import com.scaler.parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository
    ) {
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(
            VehicleType vehicleType,
            String vehicleNumber,
            String vehicleOwnerName,
            Long gateId
    ) throws GateNotFoundException {
        // 1. Create a ticket obje
        // 2. Assign spot
        // 3. Return
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gateOptional= gateRepository
                .findGateById(gateId);


        if (gateOptional.isEmpty()) {
            throw new GateNotFoundException();
        }

        Gate gate = gateOptional.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getCurrentOperator());

        Vehicle savedVehicle;

        Optional<Vehicle> vehicleOptional = vehicleRepository
                .getVehicleByNumber(vehicleNumber);

        if (vehicleOptional.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(vehicleOwnerName);

            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        } else {
            savedVehicle = vehicleOptional.get();
        }

        ticket.setVehicle(savedVehicle);

        SpotAssignmentStrategyType assignmentStrategyType = parkingLotRepository.getParkingLotForGate(
                gate
        ).getSpotAssignmentStrategyType();

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotForType(assignmentStrategyType);

        ticket.setAssignedSpot(
                spotAssignmentStrategy.getSpot(
                        gate, vehicleType
                )
        );

        // Check if vehicle in DB
        // 1. Yes
        //    -- get vehicle of database
        //    -- put in ticket object
        // 2. No
        //    -- create new vehicle
        //    -- save it to database
        //    -- put in ticket object
        ticket.setNumber("TICKET-" + ticket.getId());
        return ticketRepository.saveTicket(ticket);
    }
}

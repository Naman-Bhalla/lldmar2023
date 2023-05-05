package com.scaler.parkinglot;

import com.scaler.parkinglot.controllers.TicketController;
import com.scaler.parkinglot.repositories.GateRepository;
import com.scaler.parkinglot.repositories.ParkingLotRepository;
import com.scaler.parkinglot.repositories.TicketRepository;
import com.scaler.parkinglot.repositories.VehicleRepository;
import com.scaler.parkinglot.services.TicketService;

public class ParkingLotApplication {

    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(
                ticketService
        );




    }
}

/// c -  ts
/// |      \
/// us      \
//  |  |    |
//  ur tr ---

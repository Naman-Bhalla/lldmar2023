package com.scaler.parkinglot.controllers;

import com.scaler.parkinglot.dtos.IssueTicketRequestDto;
import com.scaler.parkinglot.dtos.IssueTicketResponseDto;
import com.scaler.parkinglot.dtos.ResponseStatus;
import com.scaler.parkinglot.models.Ticket;
import com.scaler.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // POST /ticket/issue
    public IssueTicketResponseDto issueTicket(
            IssueTicketRequestDto request) {
        IssueTicketResponseDto response = new IssueTicketResponseDto();
        Ticket ticket;

        try {
            ticket = ticketService.issueTicket(
                    request.getVehicleType(),
                    request.getVehicleNumber(),
                    request.getVehicleOwnerName(),
                    request.getGateId()
            );
        } catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureReason(e.getMessage());
            return response;
        }

        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicket(ticket);

        return response;
    }

//    public CancelTicketResponseDto cancelTicket(CancelTicketRequestDto request) {}
}

// 1. validates the request
// 2. it calls relevant services
// 3. it receives input from those
// 4. it creates output for client
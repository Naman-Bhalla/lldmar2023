package com.scaler.parkinglot.dtos;

import com.scaler.parkinglot.models.Ticket;

public class IssueTicketResponseDto {
    private ResponseStatus responseStatus;
    private String failureReason;
    private Ticket ticket;

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

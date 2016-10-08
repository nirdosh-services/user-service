package com.nirdosh.domain.model.transportation;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class FlightDetail {

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime departureDate;

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime arrivalDate;

    private FlightType flightType;

    private String from;

    private String to;

    private String airline;

    private String flightNumber;

    private String seatNo;

    public DateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(DateTime departureDate) {
        this.departureDate = departureDate;
    }

    public DateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(DateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}

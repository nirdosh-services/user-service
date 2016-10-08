package com.nirdosh.domain.model.transportation;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

public class FlightInfo {

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime departureDate;

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime arrivalDate;

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime departureDateR;

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime arrivalDateR;

    private String airlineName;

    private String departureLoc;

    private String arrivalLoc;

    // return fligh detail
    private String departureLocR;

    private String arrivalLocR;

    private String departingFlightNumber;

    private String arrivingFlightNumber;

    private String departingFlightNumberR;

    private String arrivingFlightNumberR;

    private List<FlightDetail> flightDetails;

    private List<FlightDetail> flightDetailsR;


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

    public DateTime getDepartureDateR() {
        return departureDateR;
    }

    public void setDepartureDateR(DateTime departureDateR) {
        this.departureDateR = departureDateR;
    }

    public DateTime getArrivalDateR() {
        return arrivalDateR;
    }

    public void setArrivalDateR(DateTime arrivalDateR) {
        this.arrivalDateR = arrivalDateR;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getDepartureLoc() {
        return departureLoc;
    }

    public void setDepartureLoc(String departureLoc) {
        this.departureLoc = departureLoc;
    }
    public String getArrivalLoc() {
        return arrivalLoc;
    }

    public void setArrivalLoc(String arrivalLoc) {
        this.arrivalLoc = arrivalLoc;
    }

    public String getDepartureLocR() {
        return departureLocR;
    }

    public void setDepartureLocR(String departureLocR) {
        this.departureLocR = departureLocR;
    }

    public String getArrivalLocR() {
        return arrivalLocR;
    }

    public void setArrivalLocR(String arrivalLocR) {
        this.arrivalLocR = arrivalLocR;
    }

    public String getDepartingFlightNumber() {
        return departingFlightNumber;
    }

    public void setDepartingFlightNumber(String departingFlightNumber) {
        this.departingFlightNumber = departingFlightNumber;
    }

    public String getArrivingFlightNumber() {
        return arrivingFlightNumber;
    }

    public void setArrivingFlightNumber(String arrivingFlightNumber) {
        this.arrivingFlightNumber = arrivingFlightNumber;
    }

    public String getDepartingFlightNumberR() {
        return departingFlightNumberR;
    }

    public void setDepartingFlightNumberR(String departingFlightNumberR) {
        this.departingFlightNumberR = departingFlightNumberR;
    }

    public String getArrivingFlightNumberR() {
        return arrivingFlightNumberR;
    }

    public void setArrivingFlightNumberR(String arrivingFlightNumberR) {
        this.arrivingFlightNumberR = arrivingFlightNumberR;
    }

    public List<FlightDetail> getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(List<FlightDetail> flightDetails) {
        this.flightDetails = flightDetails;
    }

    public List<FlightDetail> getFlightDetailsR() {
        return flightDetailsR;
    }

    public void setFlightDetailsR(List<FlightDetail> flightDetailsR) {
        this.flightDetailsR = flightDetailsR;
    }
}

package com.nirdosh.domain.model.transportation;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class FlightDetail {

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public DateTime departureDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    public DateTime arrivalDate;

    public FlightType flightType;

    public String from;

    public String to;

    public String airline;

    public String flightNumber;

    public String seatNo;

}

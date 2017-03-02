package com.nirdosh.domain.model.transportation;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {
    public List<FlightDetail> outboundFlights;
    public List<FlightDetail> returnFlights;
    public List<TrainDetail> trainDetails;

    public Itinerary outboundFlight(FlightDetail outboundFlight) {
        if(outboundFlights == null){
            outboundFlights = new ArrayList<>();
        }
        outboundFlights.add(outboundFlight);
        return this;
    }

    public Itinerary returnFlight(FlightDetail returnFlight) {
        if(returnFlights == null){
            returnFlights = new ArrayList<>();
        }
        returnFlights.add(returnFlight);
        return this;
    }
}

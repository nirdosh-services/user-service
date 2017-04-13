package com.nirdosh.domain.model.transportation;

import org.springframework.stereotype.Component;

@Component
public class ItineraryFactory {
    private final FlightDetailsMother flightDetailsMother;

    public ItineraryFactory(FlightDetailsMother flightDetailsMother) {
        this.flightDetailsMother = flightDetailsMother;
    }

    public Itinerary getItinerary() {
        Itinerary itinerary = new Itinerary(flightDetailsMother.getOutboundFlight(),
                                               flightDetailsMother.getReturnFlight(),
                                               null);
        return itinerary;
    }
}
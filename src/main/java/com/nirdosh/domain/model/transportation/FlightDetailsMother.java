package com.nirdosh.domain.model.transportation;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FlightDetailsMother {
    public FlightDetailsMother() {
    }

    public List<FlightDetail> getOutboundFlight() {
        FlightDetail flightDetail = new FlightDetail(DateTime.now(),
                                                        DateTime.now(),
                                                        FlightType.ARRIVAL,
                                                        "AirFrance",
                                                        "Mumbai",
                                                        "Berlin",
                                                        "",
                                                        "");
        return Arrays.asList(flightDetail);
    }

    public List<FlightDetail> getReturnFlight() {
        FlightDetail flightDetail = new FlightDetail(DateTime.now(),
                                                        DateTime.now(),
                                                        FlightType.ARRIVAL,
                                                        "AirFrance",
                                                        "Mumbai",
                                                        "Berlin",
                                                        "",
                                                        "");
        return Arrays.asList(flightDetail);
    }
}
package com.nirdosh.domain.model.transportation

import java.util.List;

class Itinerary(
                 var outboundFlights: List[FlightDetail],
                 var returnFlights: List[FlightDetail],
                 var trainDetail: List[TrainDetail]

               ) {

}

package com.nirdosh.domain.model.transportation

import org.joda.time.DateTime

class FlightDetail(
                    var departureDate: DateTime,
                    var arrivalDate: DateTime,
                    var flightType: FlightType,
                    var from: String,
                    var to: String,
                    var airline: String,
                    var flightNumber: String,
                    var seatNo: String
                    ){

}

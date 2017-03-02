package com.nirdosh.domain.model.transportation;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class TrainDetail {

    public String arrivingStation;

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    public DateTime arrivalTime;

    public String number;

}

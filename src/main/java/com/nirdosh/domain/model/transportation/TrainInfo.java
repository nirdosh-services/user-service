package com.nirdosh.domain.model.transportation;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class TrainInfo {

    private String arrivingStation;

    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
    private DateTime arrivalTime;

    private String number;

    public String getArrivingStation() {
        return arrivingStation;
    }

    public void setArrivingStation(String arrivingStation) {
        this.arrivingStation = arrivingStation;
    }

    public DateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(DateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}

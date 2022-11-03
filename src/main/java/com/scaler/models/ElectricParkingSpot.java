package com.scaler.models;

public class ElectricParkingSpot extends BaseModel {

    private ParkingSpot parkingSpot;
    private ElectricCharger eLectricCharger;

    public ElectricParkingSpot(ElectricCharger eLectricCharger) {
        this.eLectricCharger = eLectricCharger;
    }
}

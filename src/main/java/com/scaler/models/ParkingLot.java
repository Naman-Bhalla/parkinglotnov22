package com.scaler.models;

import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel {
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private Map<VehicleType, VehicleTypePrice> vehicleTypePriceMap;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public Map<VehicleType, VehicleTypePrice> getVehicleTypePriceMap() {
        return vehicleTypePriceMap;
    }

    public void setVehicleTypePriceMap(Map<VehicleType, VehicleTypePrice> vehicleTypePriceMap) {
        this.vehicleTypePriceMap = vehicleTypePriceMap;
    }
}


// Student {
//  Batch
// }
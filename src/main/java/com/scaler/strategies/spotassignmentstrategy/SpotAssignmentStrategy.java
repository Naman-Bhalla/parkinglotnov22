package com.scaler.strategies.spotassignmentstrategy;

import com.scaler.models.*;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot,
                           SpotType spotType,
                           Gate entryGate);
}

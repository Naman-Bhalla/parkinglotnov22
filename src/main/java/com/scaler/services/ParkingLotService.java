package com.scaler.services;

import com.scaler.dtos.CreateParkingLotRequestDto;
import com.scaler.models.ParkingLot;
import com.scaler.repositories.ParkingLotRepository;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public ParkingLot createParkingLot(String address) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(address);
        ParkingLot savedParkingLot = ParkingLotRepository.save(parkingLot);
        return savedParkingLot;
    }
}


// UserController
// registerUser() {
//  userService.registerUser()
// }
// MCController
// registerMasterclass() {
//  if (!userAccount) {
//      userService.createAccount();
//  }
//  MCService.registerUser();
// }

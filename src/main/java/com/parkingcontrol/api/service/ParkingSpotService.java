package com.parkingcontrol.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import com.parkingcontrol.api.model.ParkingSpotModel;
import com.parkingcontrol.api.repositories.ParkingSpotRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParkingSpotService {
    
    private final ParkingSpotRepository parkingSpotRepository;


    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }


    public boolean existsByLicensePlateCar(String licensePlaterCar) {
        return existsByLicensePlateCar(licensePlaterCar);
    }


    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return existsByParkingSpotNumber(parkingSpotNumber);
    }


    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return existsByApartmentAndBlock(apartment, block);
    }

    public List<ParkingSpotModel> findAll() {
        return parkingSpotRepository.findAll();
    }


    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }
}

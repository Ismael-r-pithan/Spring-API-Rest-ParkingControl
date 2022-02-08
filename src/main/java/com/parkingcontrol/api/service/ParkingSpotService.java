package com.parkingcontrol.api.service;

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

}

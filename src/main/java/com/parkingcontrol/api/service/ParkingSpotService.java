package com.parkingcontrol.api.service;

import com.parkingcontrol.api.repositories.ParkingSpotRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParkingSpotService {
    
    private final ParkingSpotRepository parkingSpotRepository;


}

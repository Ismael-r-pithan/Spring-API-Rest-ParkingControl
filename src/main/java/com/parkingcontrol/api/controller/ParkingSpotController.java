package com.parkingcontrol.api.controller;

import com.parkingcontrol.api.service.ParkingSpotService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parkingspot")
@AllArgsConstructor
public class ParkingSpotController {
    
    private final ParkingSpotService parkingSpotService;


}

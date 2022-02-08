package com.parkingcontrol.api.repositories;

import java.util.UUID;

import com.parkingcontrol.api.model.ParkingSpotModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
    
}

package com.parkingcontrol.api.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Singular;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;
    
    @NotBlank
    @Size(max = 7)
    private String licensePlaterCar;
    
    @NotBlank
    private String brandCar;
    
    @NotBlank
    private String modelCar;
    
    @NotBlank
    private String colorCar;
    
    @NotBlank
    private String responsibleName;
    
    @NotBlank
    private String apartment;
    
    @NotBlank
    private String block;
}

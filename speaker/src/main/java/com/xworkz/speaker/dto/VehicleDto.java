package com.xworkz.speaker.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
public class VehicleDto {

    @NotBlank
    @Size(min = 3, max = 30,message = "vehicle Number in the range of 3 to 30")
    private String vehicleNumber;

    @NotBlank
    @Size(min = 3, max = 30,message = "vehicle Model Can not be null")
    private String vehicleModel;

    @NotBlank
    @Size(min = 3, max = 20,message = "vehicle Brand in the range of 3 to 20")
    private String vehicleBrand;

    @NotNull(message = "Rental amount Can not be null")
    @Positive(message = "Rental amount must be greater than 0")
    private Double rentalAmount;

    @NotNull(message = "Availability Can not be null")
    private String availability;

}

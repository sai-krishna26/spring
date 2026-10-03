package com.xworkz.speaker.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class VehicleDto {

    @NotBlank
    @Pattern(
            regexp = "^[A-Z]{2}[ -]?[0-9]{1,2}[ -]?[A-Z]{1,3}[ -]?[0-9]{4}$",
            message = "Enter a valid vehicle number"
    )
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

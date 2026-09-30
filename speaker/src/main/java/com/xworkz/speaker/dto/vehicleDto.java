package com.xworkz.speaker.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class vehicleDto {

    @NotBlank
    @Size(min = 3, max = 30,message = "vehicle Number in the range of 3 to 30")
    private String vehicleNumber;

    @NotBlank
    @Size(min = 3, max = 30,message = "vehicle Model Can not be null")
    private String vehicleModel;

    @NotBlank
    @Size(min = 3, max = 20,message = "vehicle Brand in the range of 3 to 20")
    private String vehicleBrand;

    @NotNull(message = "Rental amount is required")
    @Positive(message = "Rental amount must be greater than 0")
    private Double rentalAmount;

    @NotNull(message = "Availability is required")
    private Boolean availability;

}

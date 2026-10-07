package com.xworkz.opener.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class WineDto
{
    @NotBlank
    @Size(min = 3, max = 30,message="Company name should be between 3 and 30 characters")
    private String companyName;

    @NotBlank
    @Size(min = 3, max = 30,message="Manufacturer name should be between 3 and 30 characters")
    private String mnfName;

    @NotBlank
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate mnfDate;

    @NotBlank(message = "Age is required, Age should be at least 18")
    @Min(18)
    private Integer age;
}

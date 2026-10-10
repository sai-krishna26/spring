package com.xworkz.opener.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
public class WineDto
{
    @NotBlank
    @Size(min = 3, max = 30,message="Company name should be between 3 and 30 characters")
    private String companyName;

    private String location;

    @NotBlank
    @Size(min = 3, max = 30,message="Manufacturer name should be between 3 and 30 characters")
    private String mnfName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate mnfDate;

    @NotBlank
    @Size(min = 3, max = 30,message="Variety should be between 3 and 30 characters")
    private String variety;

    @Positive(message = "Age should be positive")
    private Integer age;
}

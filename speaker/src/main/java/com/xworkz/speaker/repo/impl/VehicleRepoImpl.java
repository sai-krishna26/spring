package com.xworkz.speaker.repo.impl;

import com.xworkz.speaker.dto.VehicleDto;
import com.xworkz.speaker.repo.VehicleRepo;
import org.springframework.stereotype.Component;

@Component
public class VehicleRepoImpl implements VehicleRepo {
    @Override
    public void save(VehicleDto vehicleDto) {
        System.out.println("Running save() in VehicleRepoImpl");
    }
}

package com.xworkz.speaker.service.impl;

import com.xworkz.speaker.dto.VehicleDto;
import com.xworkz.speaker.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    public VehicleServiceImpl() {
        System.out.println("VehicleServiceImpl started");
    }

    @Override
    public boolean save(VehicleDto vehicleDto) {
        System.out.println("Running save() in VehicleServiceImpl");
        return true;
    }
}

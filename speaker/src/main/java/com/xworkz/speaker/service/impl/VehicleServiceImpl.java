package com.xworkz.speaker.service.impl;

import com.xworkz.speaker.dto.VehicleDto;
import com.xworkz.speaker.repo.VehicleRepo;
import com.xworkz.speaker.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public VehicleServiceImpl() {
        System.out.println("VehicleServiceImpl started");
    }

    @Override
    public boolean save(VehicleDto vehicleDto) {
        System.out.println("Running save() method in VehicleServiceImpl");
        if(vehicleDto!=null)
        {
            System.out.println("sending dto from service to repo");
            this.vehicleRepo.save(vehicleDto);
        }
        return true;
    }


}

package com.xworkz.opener.service;

import com.xworkz.opener.dto.WineDto;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl implements WineService{

    @Override
    public boolean save(WineDto wineDto) {
        System.out.println("save method started");
        if(wineDto!=null)
        {
            System.out.println("sending dto from service to repo");
            this.
        }
    }
}

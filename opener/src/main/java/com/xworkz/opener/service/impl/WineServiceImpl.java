package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import com.xworkz.opener.service.WineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepo wineRepo;
    //@Autowired
    //private WineEntity wineEntity;

    @Override
    public boolean save(WineDto wineDto) {
        System.out.println("save method started in WineServiceImpl");
        if(wineDto!=null)
        {
            System.out.println("sending dto from service to repo");
            this.wineRepo.save(wineDto);
            //BeanUtils.copyProperties(wineDto,wineEntity);
            return true;
        }
        return false;
    }


}

package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.repo.WineRepo;
import org.springframework.stereotype.Repository;

@Repository
public class WineRepoImpl implements WineRepo {
    @Override
    public boolean save(WineDto wineDto) {
        System.out.println("save method started in WineRepoImpl");
        return true;
    }
}

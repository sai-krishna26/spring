package com.xworkz.opener.repo;

import com.xworkz.opener.dto.WineDto;

public class WineRepoImpl implements WineRepo{
    @Override
    public boolean save(WineDto wineDto) {
        System.out.println("save method started in WineRepoImpl");
        return true;
    }
}

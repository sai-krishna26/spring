package com.xworkz.opener.repo;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.entity.WineEntity;

import java.util.List;

public interface WineRepo {
    public boolean save(WineEntity wineEntity);
    public List<WineEntity> findAll();
}

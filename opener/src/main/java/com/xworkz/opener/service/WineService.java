package com.xworkz.opener.service;

import com.xworkz.opener.dto.WineDto;

import java.util.List;

public interface WineService {
    public boolean save(WineDto wineDto);
    public List<WineDto> findAll();
    public WineDto findById(Integer id);
    public void deleteById(Integer id);
}

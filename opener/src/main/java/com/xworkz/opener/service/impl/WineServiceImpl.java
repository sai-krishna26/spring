package com.xworkz.opener.service.impl;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import com.xworkz.opener.service.WineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepo wineRepo;

    @Override
    public boolean save(WineDto wineDto) {
        System.out.println("save method started in WineServiceImpl");
        if(wineDto!=null)
        {
            System.out.println("sending dto from service to repo");
            WineEntity wineEntity=new WineEntity();
            BeanUtils.copyProperties(wineDto,wineEntity);
            this.wineRepo.save(wineEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<WineDto> findAll()
    {
        System.out.println("findAll() method is started in WineServiceImpl");

        List<WineEntity> entityList=this.wineRepo.findAll();
        List<WineDto> wineDtoList=new ArrayList<>();

        if(entityList != null)
        {
            System.out.println("converting entity to dto in findAll() method of WineServiceImpl");

            wineDtoList=entityList.stream().map(entity -> {
                WineDto wineDto = new WineDto();
                BeanUtils.copyProperties(entity,wineDto);
                System.out.println("converted entity:"+wineDto);
                return wineDto;
            }).collect(Collectors.toList());
        }
        System.out.println("wineDto count:"+wineDtoList.size());

        return wineDtoList;
    }

    @Override
    public WineDto findById(Integer id) {
        //return this.wineRepo.findById(id);
        System.out.println("findById() method is started in WineServiceImpl");
        if(id>0)
        {
            System.out.println("id is valid");
            Optional<WineEntity> wineEntity=this.wineRepo.findById(id);
            if(wineEntity.isPresent())
            {
                System.out.println("we got a id");
                WineDto wineDto= new WineDto();
                BeanUtils.copyProperties(wineEntity.get(), wineDto);
                return wineDto;
            }
        }
        System.out.println("id is invalid, please check the id");

        return null;
    }
}

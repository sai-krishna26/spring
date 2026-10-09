package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class WineRepoImpl implements WineRepo {

    public WineRepoImpl() {
        System.out.println("WineRepoImpl started");
    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean save(WineEntity wineEntity) {
        System.out.println("save method started in WineRepoImpl");
        entityManager.persist(wineEntity);
        return true;
    }

    @Override
    public List<WineEntity> findAll() {
        System.out.println("findAll() method is started in WineRepoImpl");
        List<WineEntity> wineEntityList = this.entityManager
                .createNamedQuery("findAll",WineEntity.class)
                .getResultList();

        System.out.println("wineEntiyList count:"+wineEntityList.size());

        return wineEntityList;
    }
}

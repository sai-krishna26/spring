package com.xworkz.opener.repo.impl;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.entity.WineEntity;
import com.xworkz.opener.repo.WineRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

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
    public boolean update(WineEntity wineEntity) {
        System.out.println("update method started in WineRepoImpl");
        entityManager.merge(wineEntity);
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

    @Override
    public Optional<WineEntity> findById(Integer id) {
        System.out.println("findById() method is started in WineRepoImpl");
        WineEntity wineEntity=this.entityManager.find(WineEntity.class, id);
        return Optional.ofNullable(wineEntity);
    }

    @Override
    public void deleteById(Integer id) {
        System.out.println("deleteById() method is started in WineRepoImpl");
        WineEntity wineEntity=entityManager.find(WineEntity.class,id);
        if(wineEntity!=null) {
            this.entityManager.remove(wineEntity);
            System.out.println("Wine deleted successfully with id:"+id);
        }
        else
        {
            System.out.println("Wine not found with id:"+id);
        }
    }
}

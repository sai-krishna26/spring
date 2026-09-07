package com.xworkz.SmartPg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bottle {

    private Perfume perfume;
    private Paint paint;
    private Glue glue;

    public Bottle()
    {
        System.out.println("Bottle created");
    }

    @Autowired
    public Bottle(Perfume perfume,Paint paint,Glue glue)
    {
        System.out.println("Bottle(perfume,paint,glue) created");
        this.perfume=perfume;
        this.paint=paint;
        this.glue=glue;
    }
}

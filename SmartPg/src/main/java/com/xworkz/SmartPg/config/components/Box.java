package com.xworkz.SmartPg.config.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    private Paint paint;

    public Box()
    {
        System.out.println("Box created");
    }

    @Autowired
    public Box(Paint paint)
    {
        System.out.println("Box(paint) created");
        this.paint=paint;
    }
}

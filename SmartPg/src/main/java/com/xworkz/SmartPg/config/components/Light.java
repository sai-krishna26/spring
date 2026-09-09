package com.xworkz.SmartPg.config.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Light {

    private Marker marker;
    public Light()
    {
        System.out.println("Light created");
    }

    @Autowired
    public Light(Marker marker)
    {
        System.out.println("Light(marker) created");
        this.marker=marker;
    }

}

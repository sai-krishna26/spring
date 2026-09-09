package com.xworkz.SmartPg.config.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {

    private Light light;

    private Camera()
    {
    System.out.println("Camera created");
    }

    @Autowired
    private Camera(Light light)
    {
        System.out.println("Camera(light) created");
        this.light=light;
    }
}

package com.xworkz.SmartPg.config.components;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Marker {
    public Marker() {
        System.out.println("Marker created");
    }
}


package com.xworkz.SmartPg.config.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Elephant{
    private Glue glue;

    public Elephant() {
        System.out.println("Elephant created");
    }

    @Autowired
    public Elephant(Glue glue) {
        System.out.println("Elephant(glue) created");
        this.glue = glue;
    }
}

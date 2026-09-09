package com.xworkz.SmartPg.config.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shield {
    private Paint paint;

    public Shield() {
        System.out.println("Shield created");
    }

    @Autowired
    public Shield(Paint paint) {
        System.out.println("Shield(paint) created");
        this.paint=paint;
    }
}

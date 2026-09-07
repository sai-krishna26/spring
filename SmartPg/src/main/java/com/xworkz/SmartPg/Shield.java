package com.xworkz.SmartPg;

import org.springframework.beans.factory.annotation.Autowired;

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

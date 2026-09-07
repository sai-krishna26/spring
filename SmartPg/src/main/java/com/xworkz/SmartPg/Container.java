package com.xworkz.SmartPg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Container {
    private Glass glass;

    public Container()
    {
        System.out.println("Container created");
    }

    @Autowired
    public Container(Glass glass)
    {
        System.out.println("Container(glass) created");
        this.glass=glass;
    }
}

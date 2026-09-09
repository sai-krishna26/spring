package com.xworkz.SmartPg.config;

import com.xworkz.SmartPg.config.components.Marker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.xworkz.SmartPg.config.components")
public class SrBoysConfig {
    public SrBoysConfig()
    {
        System.out.println("SrBoysConfig created");
    }


    @Bean
    public Marker getMarker()
    {
        Marker marker=new Marker();
        System.out.println("Marker created in getMarker()");
        return marker;
    }
}

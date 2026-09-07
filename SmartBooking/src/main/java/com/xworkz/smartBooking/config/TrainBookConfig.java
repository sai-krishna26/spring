package com.xworkz.smartBooking.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class TrainBookConfig implements WebMvcConfigurer {
    public TrainBookConfig()
    {
        System.out.println("created TrainBookConfig");
    }
}

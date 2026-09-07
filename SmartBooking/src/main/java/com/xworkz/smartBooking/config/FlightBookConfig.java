package com.xworkz.smartBooking.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FlightBookConfig implements WebMvcConfigurer {
 public FlightBookConfig()
 {
     System.out.println("created FlightBookConfig");
 }
}

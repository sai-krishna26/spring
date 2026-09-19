package com.xworkz.speaker.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.xworkz.speaker")
@EnableWebMvc
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("ApplicationConfiguration started");
    }
}

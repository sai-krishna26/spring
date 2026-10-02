package com.xworkz.speaker.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "com.xworkz.speaker")
@EnableWebMvc
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("ApplicationConfiguration started");
    }


}

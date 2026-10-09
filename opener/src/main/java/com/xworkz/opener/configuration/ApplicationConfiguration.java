package com.xworkz.opener.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.opener")
public class ApplicationConfiguration {
    public ApplicationConfiguration()
    {
        System.out.println("ApplicationConfiguration started");
    }
}

package com.xworkz.speaker.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    public ApplicationWebInit() {
        System.out.println("ApplicationWebInit started");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses started");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses started");
        return new Class[]{ApplicationConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings started");
        return new String[]{"/"};
    }
}

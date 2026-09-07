package com.xworkz.SmartPg.initializer;

import com.xworkz.SmartPg.config.SrBoysConfig;
import com.xworkz.SmartPg.config.SrLadiesConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SmartPgWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public SmartPgWebInitializer() {
        System.out.println("SmartPgWebInitializer created");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SrLadiesConfig.class, SrBoysConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}

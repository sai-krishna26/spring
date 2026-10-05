package com.xworkz.speaker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


@Configuration
public class DataBaseConfiguration {

    public DataBaseConfiguration()
    {
        System.out.println("Created DataBaseConfiguration");
    }

    @Bean
    public DataSource dataSource()
    {
        System.out.println("Running dataSource() in DataBaseConfiguration");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/your_database");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        System.out.println("Running entityManagerFactory() in DataBaseConfiguration");
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource);
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factory.setPackagesToScan("com.xworkz.speaker.dto");
        return factory;
    }

    @Bean
    public PlatformTransactionManger platformTransactionManager(EntityManagerFactory entityManagerFactory)
    {
        System.out.println("Running transactionManger() in DataBaseConfiguration");
        JPATransactionManger jpaTransactionManger=new JPATransactionManger(entityManagerFactory);
        jpaTransactionManger.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManger;
    }
}

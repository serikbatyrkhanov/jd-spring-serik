package com.serik.configs;

import com.serik.services.Java;
import com.serik.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.serik")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Java java(){
        return new Java();
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

}

package com.serik.configs;

import com.serik.interfaces.ExtraSessions;
import com.serik.services.Java;
import com.serik.services.OfficeHours;
import com.serik.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.serik")
public class AppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

}

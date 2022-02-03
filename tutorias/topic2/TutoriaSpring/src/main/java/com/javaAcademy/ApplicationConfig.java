package com.javaAcademy;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Musician Musician(){
        return new Musician();
    }
}

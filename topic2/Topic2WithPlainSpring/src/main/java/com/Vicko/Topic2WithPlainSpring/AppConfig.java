package com.Vicko.Topic2WithPlainSpring;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    WorkSpace workSpace(){
        return new WorkSpace();
    }
}

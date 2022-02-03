package com.vicko.sfwDependencyInjection.Services.HowToUseDI;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingsService implements GrettingsService{
    @Override
    public String sayHello() {
        return "Hola otra vez - Yo soy para cuando se usan propiedades";
    }
}

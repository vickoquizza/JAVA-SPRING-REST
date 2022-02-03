package com.vicko.sfwDependencyInjection.Services.HowToUseDI;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsService implements GrettingsService{
    @Override
    public String sayHello() {
        return "Hola otra vez - esta vez estoy usando Primary beans con este servicio";
    }
}

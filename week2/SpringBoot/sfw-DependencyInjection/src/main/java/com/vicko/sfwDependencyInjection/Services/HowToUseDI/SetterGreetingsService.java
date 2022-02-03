package com.vicko.sfwDependencyInjection.Services.HowToUseDI;

import org.springframework.stereotype.Service;

// El problema de que hayan tres servicios es que Spring se va a confundir para cual de los servicios implementar, es por eso que
//Spring usa qualifier

@Service
public class SetterGreetingsService implements GrettingsService{
    @Override
    public String sayHello() {
        return "Hola otra vez - Soy con setters";
    }
}

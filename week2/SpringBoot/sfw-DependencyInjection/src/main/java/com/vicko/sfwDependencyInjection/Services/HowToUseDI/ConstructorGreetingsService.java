package com.vicko.sfwDependencyInjection.Services.HowToUseDI;


import org.springframework.stereotype.Service;

//Se le pone el service para que Spring lo tome cuando se implmente la injeccion de dependencias en el controlador

@Service
public class ConstructorGreetingsService implements GrettingsService{

    //La implementación del objeto que va a inyectar independencias
    @Override
    public String sayHello() {
        return "Hola otra vez - Soy para el constructor";
    }
}

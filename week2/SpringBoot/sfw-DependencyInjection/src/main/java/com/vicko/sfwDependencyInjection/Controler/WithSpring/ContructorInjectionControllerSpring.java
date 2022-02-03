package com.vicko.sfwDependencyInjection.Controler.WithSpring;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectionControllerSpring {

    private final GrettingsService grettingsService;


    //Aca el autowired no es necesario porque spring como tal detecta que se hace la inyeccion de dependencias por constructor sin embargo, es una buena convención ponerlo

    // El Qualifier en este caso especifica el servicio que se va a injectar sobre el especifico controlador
    @Autowired
    public ContructorInjectionControllerSpring(@Qualifier("constructorGreetingsService") GrettingsService grettingsService) {
        this.grettingsService = grettingsService;
    }

    public String getGrettings(){
        return grettingsService.sayHello();
    }
}

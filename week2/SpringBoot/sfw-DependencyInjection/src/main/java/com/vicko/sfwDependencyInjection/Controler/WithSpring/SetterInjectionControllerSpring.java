package com.vicko.sfwDependencyInjection.Controler.WithSpring;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectionControllerSpring {

    private GrettingsService grettingsService;


    // Se añade este estereotipo de Spring, para que el framework lo marque y haga el setteo por el mismo
    @Autowired
    public void setGrettingsService(@Qualifier("setterGreetingsService") GrettingsService grettingsService) {
        this.grettingsService = grettingsService;
    }

    public String getGrettings(){
        return grettingsService.sayHello();
    }
}

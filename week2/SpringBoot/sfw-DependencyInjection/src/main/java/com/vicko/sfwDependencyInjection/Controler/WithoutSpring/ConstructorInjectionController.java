package com.vicko.sfwDependencyInjection.Controler.WithoutSpring;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;

public class ConstructorInjectionController {

    private final GrettingsService grettingsService;

    public ConstructorInjectionController(GrettingsService grettingsService) {
        this.grettingsService = grettingsService;
    }

    public String getGrettings(){
        return grettingsService.sayHello();
    }
}

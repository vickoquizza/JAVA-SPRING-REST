package com.vicko.sfwDependencyInjection.Controler.WithoutSpring;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;

public class PropertyInjectionController {

    public GrettingsService grettingsService;

    public String getGrettings(){
        return grettingsService.sayHello();
    }
}

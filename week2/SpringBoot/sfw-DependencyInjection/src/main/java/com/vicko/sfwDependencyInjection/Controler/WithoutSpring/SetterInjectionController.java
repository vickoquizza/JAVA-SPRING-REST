package com.vicko.sfwDependencyInjection.Controler.WithoutSpring;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;

public class SetterInjectionController {

    private GrettingsService grettingsService;

    public void setGrettingsService(GrettingsService grettingsService) {
        this.grettingsService = grettingsService;
    }

    public String getGrettings(){
        return grettingsService.sayHello();
    }
}

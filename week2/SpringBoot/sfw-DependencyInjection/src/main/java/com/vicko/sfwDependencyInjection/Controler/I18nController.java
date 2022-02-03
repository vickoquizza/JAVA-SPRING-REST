package com.vicko.sfwDependencyInjection.Controler;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GrettingsService grettingsService;

    public I18nController(@Qualifier("i18nService") GrettingsService grettingsService) {
        this.grettingsService = grettingsService;
    }

    public String sayHello(){
        return this.grettingsService.sayHello();
    }
}

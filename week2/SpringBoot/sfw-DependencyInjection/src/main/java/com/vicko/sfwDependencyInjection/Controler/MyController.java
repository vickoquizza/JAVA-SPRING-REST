package com.vicko.sfwDependencyInjection.Controler;


import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    //Ahora usando Primary Beans vamos a aplicar una inyeccion de dependencias

    private final GrettingsService grettingsService;

    //Se hace una inyeccion por constructor

    public MyController(GrettingsService grettingsService) {
        this.grettingsService = grettingsService;
    }

    public String sayHello(){
        return grettingsService.sayHello();
    }
}

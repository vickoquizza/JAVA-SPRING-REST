package com.vicko.sfwDependencyInjection.Controler.WithSpring;

import com.vicko.sfwDependencyInjection.Services.HowToUseDI.GrettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionControllerSpring {


    //Se utiliza para especificarle a Spring de que este es el servicio que quiero inyectar por lo que el omite que es nulo,
    //Para que Spring tenga en cuenta esto el servicio tiene que ser mapeado
    @Qualifier("propertyGreetingsService")
    @Autowired
    public GrettingsService grettingsService;

    public String getGrettings(){
        return grettingsService.sayHello();
    }
}

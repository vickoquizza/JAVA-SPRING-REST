package com.vicko.sfwDependencyInjection.Services.HowToUseDI;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Se usan los perfiles para tener diferentes alternantivas que pueden cambiar la logica de servicio de un mismo servicio
//El perfil que se va a utilizar se especifica en el application.properties

@Profile("EN")
@Service("i18nService")
public class I18nGreetingsServiceEnglish implements GrettingsService{
    @Override
    public String sayHello() {
        return "Hey this is a test to use Spring injection profiles";
    }
}

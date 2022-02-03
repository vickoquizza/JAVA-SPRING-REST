package com.vicko.sfwDependencyInjection.Services.HowToUseDI;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Se le pone un identificador al servicio ya que ambos perfiles son de un servicio relativo

//En caso de que se quiera un perfil por default se puede hacer lo siguiente

//entonces en caso de que en application.properties no se tena un active profile, el que tenga el default va ha a ser el perfil que Spring va a escoger

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nGreetingsService implements GrettingsService{
    @Override
    public String sayHello() {
        return "Esto es el perfil de I18n";
    }
}

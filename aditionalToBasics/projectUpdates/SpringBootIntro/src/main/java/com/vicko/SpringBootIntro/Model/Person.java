package com.vicko.SpringBootIntro.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

//Este al final es el modelo que va a usar el cliente para acceder a la base de datos.

public class Person {
    private final UUID id;

    @NotBlank
    private final String name;



    // Para obtener las propiedades que se nos envien desde una API como una property

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

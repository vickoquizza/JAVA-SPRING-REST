package com.vicko.SpringBootIntro.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

//Este al final es el modelo que va a usar el cliente para acceder a la base de datos.

public class Person {
    private final UUID id;
    private final String address;

    @NotBlank
    private final String name;



    // Para obtener las propiedades que se nos envien desde una API como una property

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("address") String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

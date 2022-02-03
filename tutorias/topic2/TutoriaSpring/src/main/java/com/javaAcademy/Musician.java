package com.javaAcademy;

import org.springframework.beans.factory.annotation.Value;

public class Musician {

    @Value("Juanes")
    private String name;

    private Instrument instrument;


    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playInstrument(){
        instrument.play();
    }
}

package com.vicko.java.withDesignPattern;

abstract class AutomovilDecorator implements Automovil{
    private Automovil auto;

    public AutomovilDecorator(Automovil source){
        this.auto = source;
    }

    public Automovil getAuto(){
        return auto;
    }

}

package com.vicko.java.Singleton;

public class logger {
    private logger() {

    }

    private static logger log;
    private String name;


    //Se usa syncriniced en caso de que se este usando una aplicación multihilo
    public static logger getInstance(){

        if (log == null){
            log = new logger();
        }
        return log;
    }

    public void printMessage(String msg){
        System.out.println(msg);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

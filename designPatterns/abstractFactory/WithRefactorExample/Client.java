package com.vicko.java.abstractFactory.WithRefactorExample;

public class Client {


    private static Aplication Configure(){
        Aplication app;
        GUIFactory GUI;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            GUI = new MacFactory();
            app = new Aplication(GUI);
        } else {
            GUI = new WindowsFactory();
            app = new Aplication(GUI);
        }
        return app;
    }

    public static void main(String[] args) {
        Aplication app = Configure();
        app.make();
    }
}

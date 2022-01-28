package com.vicko.java.Observer.AnotherExample;

public class Client {
    public static void main(String args[]){
        //El informador

        StockGrabber info = new StockGrabber();

        StockObserver uno = new StockObserver(info);

        info.setAPPLPrice(30.00);
        info.setIBMPrice(45.00);

        StockObserver dos = new StockObserver(info);

        info.setIBMPrice(47.00);
        info.setAPPLPrice(5.00);

        info.detach(dos);

        info.setAPPLPrice(25.00);
        info.setIBMPrice(4.00);


    }
}

package com.vicko.java.Observer.AnotherExample;

public class StockObserver implements Observer{
    private double IBMPrice;
    private double APPLPrice;

    public static int observerIDTracker = 0;

    private int ObserverID;

    private Subject StockGrabber;

    public StockObserver(Subject grabber){
        this.StockGrabber = grabber;

        this.ObserverID = ++observerIDTracker;

        StockGrabber.attach(this);
    }
    @Override
    public void update(double IBMPrice, double AAPLPrice) {
        this.IBMPrice = IBMPrice;
        this.APPLPrice = AAPLPrice;

        printPrices();

    }

    public void printPrices(){
        System.out.println(this.ObserverID + " IBMPrice: " + IBMPrice + ", APPLPrice: " + APPLPrice);
    }
}

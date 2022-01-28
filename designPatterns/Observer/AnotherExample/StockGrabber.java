package com.vicko.java.Observer.AnotherExample;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{
    private List<Observer> observers;
    private double IBMPrice;
    private double APPLPrice;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void detach(Observer detachObserver) {
        observers.remove(observers.indexOf(detachObserver));
        System.out.println((observers.indexOf(detachObserver) + 1) + " Deleted");
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(IBMPrice, APPLPrice);
        }
    }

    public void setIBMPrice(double IBMPrice){
        this.IBMPrice = IBMPrice;
        notifyObserver();
    }

    public void setAPPLPrice(double APPLPrice){
        this.APPLPrice = APPLPrice;
        notifyObserver();
    }
}

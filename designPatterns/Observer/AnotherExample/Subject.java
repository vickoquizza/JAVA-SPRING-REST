package com.vicko.java.Observer.AnotherExample;



public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObserver();
}

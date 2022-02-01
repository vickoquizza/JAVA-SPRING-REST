package Topic1.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Producto2 implements Subject{
    private List<Observer> observers;
    private double producto2Price;

    public Producto2(){
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
            o.update(2, this.producto2Price);
        }
    }

    public void setProducto2Price(double value){
        this.producto2Price = value;
        notifyObserver();
    }
}

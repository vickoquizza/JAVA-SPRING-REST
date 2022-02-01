package Topic1.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Producto1 implements Subject{
    private List<Observer> observers;
    private double producto1Price;

    public Producto1(){
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
            o.update(1, this.producto1Price);
        }
    }

    public void setProducto1Price(double value){
        this.producto1Price = value;
        notifyObserver();
    }

}

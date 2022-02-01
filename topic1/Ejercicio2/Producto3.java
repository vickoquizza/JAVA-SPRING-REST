package Topic1.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Producto3 implements Subject{
    private List<Observer> observers;
    private double producto3Price;

    public Producto3(){
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
            o.update(3, this.producto3Price);
        }
    }

    public void setProducto3Price(double value){
        this.producto3Price = value;
        notifyObserver();
    }
}

package Topic1.Ejercicio2;



public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObserver();
}

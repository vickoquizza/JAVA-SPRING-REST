package Topic1.Ejercicio3;

abstract public class ToppingDecorator implements HotDog{

    protected HotDog tempHotDog;

    public ToppingDecorator(HotDog tempHotDog){
        this.tempHotDog = tempHotDog;
    }

    public String addToDescription(){
        return tempHotDog.addToDescription();
    }

}

package Topic1.Ejercicio1.Battery;

import Topic1.Ejercicio1.Battery.Battery;

public class FirstOptionBattery implements Battery {
    private int hoursLong = 5;
    @Override
    public void setUpBattery() {
        System.out.println("Su bateria dura hasta 5 horas!");
    }
}

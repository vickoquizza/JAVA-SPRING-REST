package Topic1.Ejercicio1.Battery;

import Topic1.Ejercicio1.Battery.Battery;

public class SecondOptionBattery implements Battery {
    private int hoursLong = 8;
    @Override
    public void setUpBattery() {
        System.out.println("Su bateria dura hasta 8 horas!");
    }
}

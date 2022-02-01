package Topic1.Ejercicio1;

import Topic1.Ejercicio1.Battery.Battery;
import Topic1.Ejercicio1.Battery.FirstOptionBattery;
import Topic1.Ejercicio1.Battery.SecondOptionBattery;
import Topic1.Ejercicio1.Color.Color;
import Topic1.Ejercicio1.Color.FirstColorOption;
import Topic1.Ejercicio1.Color.SecondColorOption;
import Topic1.Ejercicio1.Memory.FirstMemory;
import Topic1.Ejercicio1.Memory.Memory;
import Topic1.Ejercicio1.Memory.SecondMemory;

public class Reproductor {
    private Memory memory;
    private Battery battery;
    private Color color;
    private String colorOption;
    private String batteryOption;
    private String memoryOption;

    public Reproductor(String value1, String value2, String value3){
        this.colorOption = value1;
        this.batteryOption = value2;
        this.memoryOption = value3;

        System.out.println("Creando su reproductor con las siguientes caracterisitcas: ");

        setSetup();
    }

    public String getColorOption() {
        return colorOption;
    }

    public String getBatteryOption() {
        return batteryOption;
    }

    public String getMemoryOption() {
        return memoryOption;
    }

    private void memoryFactor(String  option){
        switch(option){
            case "m1":
                this.memory = new FirstMemory();
                break;
            case "m2":
                this.memory = new SecondMemory();
                break;
            default:
                this.memory = null;
                break;

        }
    }

    private void batteryFactor(String  option){
        switch(option){
            case "b1":
                this.battery = new FirstOptionBattery();
                break;
            case "b2":
                this.battery = new SecondOptionBattery();
                break;
            default:
                this.memory = null;
                break;

        }
    }

    private void colorFactor(String  option){
        switch(option){
            case "c1":
                this.color = new FirstColorOption();
                break;
            case "c2":
                this.color = new SecondColorOption();
                break;
            default:
                this.memory = null;
                break;
        }
    }

    public void setSetup(){
        colorFactor(colorOption);
        memoryFactor(memoryOption);
        batteryFactor(batteryOption);
    }

    public void getSetup(){
        if(color == null){
            System.out.println("Opcion no disponible para colores");
        }else{
            color.setupColor();
        }

        if(memory == null){
            System.out.println("Opcion no disponible para memoria");
        }else{
            memory.setUpMemory();
        }

        if(battery == null){
            System.out.println("Opcion no disponible para baterias");
        }else{
            battery.setUpBattery();
        }

    }
}

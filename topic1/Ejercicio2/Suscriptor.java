package Topic1.Ejercicio2;

import com.vicko.java.Observer.AnotherExample.Subject;

public class Suscriptor implements Observer{
    private double producto1Precio;
    private double producto2Precio;
    private double producto3Precio;


    public Suscriptor(){
    }

    @Override
    public void update(int typeOfProduct, double value) {
        switch (typeOfProduct){
            case 1:
                this.producto1Precio = value;
                break;
            case 2:
                this.producto2Precio = value;
                break;
            case 3:
                this.producto3Precio = value;
                break;
            default:
                System.out.println("No se puede hacer actualización");
                break;
        }

        printPrices();

    }

    public void printPrices(){
        System.out.println("Producto 1: " + this.producto1Precio + " , Producto 2: " + this.producto2Precio + " y Producto 3: " + this.producto3Precio);
    }
}


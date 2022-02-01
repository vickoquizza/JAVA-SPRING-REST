package Topic1.Ejercicio2;

public class Tienda {
    public static void main(String args[]){

        //Definimos los objetos que actualizaran el valor de cada uno de los productos
        Producto1 producto1Info = new Producto1();
        Producto2 producto2Info = new Producto2();
        Producto3 producto3Info = new Producto3();

        //Creamos los suscriptores que van a recibir información sobre los productos
        Suscriptor cliente1 = new Suscriptor();
        Suscriptor cliente2 = new Suscriptor();

        //Al cliente 1 lo suscribimos a los precios de los productos 1 y 3
        producto1Info.attach(cliente1);
        producto3Info.attach(cliente1);

        //Al cliente 1 lo suscribimos al precio de del producto 2
        producto2Info.attach(cliente2);

        //Ahora actualizamos los precios de los 3
        producto1Info.setProducto1Price(75.0);
        producto2Info.setProducto2Price(80.0);
        producto3Info.setProducto3Price(15.0);

        //Desuscribimos al cliente dos del producto 2 y suscribimos al 1 con un nuevo precio
        producto2Info.detach(cliente2);
        producto2Info.attach(cliente1);
        producto2Info.setProducto2Price(90);
        System.out.println("Para el cliente dos el precio del producto 2 quedo en: ");
        cliente2.printPrices();
    }
}

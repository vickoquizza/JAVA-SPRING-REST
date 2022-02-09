package ListLambdasAndMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Transforming {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Mariano", "Jack", "Mark", "Laura");

        //Por lo general la manera de modificar o transformar la lista anterior en una nueva lista seria la siguiente
        List<String> friendsInCaps = new ArrayList<>();
        /*for(String friend: friends){
            friendsInCaps.add(friend.toUpperCase());
        }*/

        //Sin embargo, con forEach lo podemos hacer de forma funcional
        friends.forEach(friend -> friendsInCaps.add(friend.toUpperCase()));
        System.out.println(friendsInCaps);

        //Pero tambien usando los Streams de Java se pueden utilizar una interfaz que permita con diferentes
        //metodos transformar o hacer cosas con collecciones a traves de metrodos abstractos, como en este caso es .map()
      /*  friends.stream()
                .map(friend -> friend.toUpperCase())
                .forEach(friend -> System.out.print(friend + " "));*/
        //En este caso con map transforma una secuencia de entrada en una secuencia de salida, y el forEach permite imprimir cada una de las salidas una a una


        //Lo bueno de usar stream y map es que no necesariamente se abstraen al tipo de la colleción, si no que map acepta como entrada una collección y dara como salida otra
        friends.stream()
                .map(friend -> friend.length())
                .forEach(friend -> System.out.print(friend + " "));
        System.out.println();


        //Para el primer caso Java permite utilizar para interfaces funcionales los metodos de referencia
        friends.stream()
                .map(String::toUpperCase)
                .forEach(friend -> System.out.print(friend + " "));

    }
}

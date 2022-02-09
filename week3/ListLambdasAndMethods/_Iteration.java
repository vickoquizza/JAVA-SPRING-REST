package ListLambdasAndMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _Iteration {
    public static void  main(String[] args) {
        List<String> friends = Arrays.asList("Mariano", "Jack", "Mark", "Laura");

        //Por lo general la forma de iterar normalmente es
        for(String friend: friends){
            System.out.println(friend);
        }

        //Es por eso que podemos usar el forEach de los iteradores que es funcional y una función de orden mayor
        // Puede recibir una funcion consumer anonima que evita utilizar ciclos secuenciales
       /* friends.forEach(new Consumer<String> (){
            public void accept(final String friend){
                System.out.println(friend);
            }
        });*/

        //Lo mejor de esto es que para evitar todo el verbose podemos utilizar funciones con el operador lambda
        friends.forEach(System.out::println);
    }
}

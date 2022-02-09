package Optionals;

import java.io.IOException;
import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {
        //Para usar optional simplemente se usa la palabra clave Optional

        //Aqui estamos usando un optional vacio por lo que es un objeto que no es nulo, pero sin embargo, esta vacio
        Optional<String> empty = Optional.ofNullable(null);

        //Esto nos ayuda a saber si hay una determinada variable adentro del optional
        System.out.println(empty.isPresent());
        //Esto nos ayuda a saber si un optional esta vacio
        System.out.println(empty.isEmpty());

        //Esto es para poner un valor por defecto cuando el opcional no tiene ningun valor presente
        String anotherResponse = empty
                .map(String::toUpperCase)
                .orElse("word");

        System.out.println(anotherResponse);

        //El optional es una interfaz funcional que nos permite dar un approach declarativo a como se hacen los optionales para evitar los objetos nullos o vacios

        //en if-present lo usamos para ejecutar una logica en caso de que el objeto este presente
        empty.ifPresent(System.out::println);

        empty.ifPresentOrElse(word -> System.out.println(word + "Esta presente"), () -> System.out.println("Esto es si no esta presente ") );

        //entonces podemos usar los optionals para cuando recibimos datos en un objeto y posiblemente estos sean erroneos

        Person james = new Person("James" , null);

        System.out.println(james.getEmail().map(String::toLowerCase).orElse("Email not available"));
    }
}

class Person{
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
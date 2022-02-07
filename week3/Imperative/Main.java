package Imperative;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Vicko", "Hombre"),
            new Person("Laura", "Mujer"),
            new Person("Manin", "Hombre")
        );

        //Imperative approach

        List<Person> females = new ArrayList<>();

        System.out.println("Imperative approach");
        for(Person element: people){
            if(element.gender.equals("Mujer")){
                females.add(element);
            }
        }

        for(Person element: females){
            System.out.println(element.name);
        }

        //Declarative approach
        Predicate<Person> personPredicate = person -> person.gender.equals("Hombre");
        System.out.println("Declarative approach");
        List<Person> hombres = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        for(Person element: hombres){
            System.out.println(element.name);
        }


    }

    static class Person {
        private String name;
        private String gender;

        public Person(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }
    }
}

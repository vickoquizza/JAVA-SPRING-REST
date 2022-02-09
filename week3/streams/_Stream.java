package streams;

import Imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vicko", "Hombre"),
                new Person("Laura", "Mujer"),
                new Person("Manin", "Hombre"),
                new Person("Mariana", "Mujer")
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> person.gender.equals("Mujer"));

        System.out.println(containsOnlyFemales);
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

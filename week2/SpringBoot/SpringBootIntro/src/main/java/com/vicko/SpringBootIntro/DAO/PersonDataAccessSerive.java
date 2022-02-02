package com.vicko.SpringBootIntro.DAO;

import com.vicko.SpringBootIntro.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Podemos hacer ditintas injecciones de dependencias que tengamos si usamos repositorios
@Repository("PostgresDB")
public class PersonDataAccessSerive implements PersonDAO{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int insertPerson(Person person) {
        return PersonDAO.super.insertPerson(person);
    }

    @Override
    public List<Person> selectPeople() {
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB", "THIS IS ANOTHER REPO"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID uuid) {
        return 0;
    }

    @Override
    public int updatePersonbyId(UUID uuid, Person person) {
        return 0;
    }
}

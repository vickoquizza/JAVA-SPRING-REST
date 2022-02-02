package com.vicko.SpringBootIntro.DAO;

import com.vicko.SpringBootIntro.Model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    int insertPerson(UUID id, Person person);

    default  int insertPerson(Person person){
        UUID id = UUID.randomUUID();

        return insertPerson(id,person);
    }

    List<Person> selectPeople();

    Optional<Person> selectPersonById(UUID uuid);

    int deletePersonById(UUID uuid);

    int updatePersonbyId(UUID uuid, Person person);


}

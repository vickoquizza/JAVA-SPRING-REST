package com.vicko.SpringBootIntro.DAO;

import com.vicko.SpringBootIntro.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

// Se instancia esta clase como un repositorio para que pueda ser inyectada sobre otras clases.

@Repository("fake")
public class FakePersonDataAccessService implements PersonDAO{

    private List<Person> fakeDB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        fakeDB.add(new Person(id, person.getName(), person.getAddress()));
        return 1;
    }

    @Override
    public List<Person> selectPeople() {
        return fakeDB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID uuid) {

        return fakeDB.stream()
                .filter(Person -> Person.getId().equals(uuid))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID uuid) {
        Optional<Person> personSelected = selectPersonById(uuid);
        if(personSelected.isEmpty()){
            return 0;
        }else{
            fakeDB.remove(personSelected.get());
            return 1;
        }

    }



    @Override
    public int updatePersonbyId(UUID uuid, Person update) {
        return selectPersonById(uuid)
                .map(person -> {
                    int indexPersonToUpdate = fakeDB.indexOf(person);
                    if(indexPersonToUpdate >= 0){
                        fakeDB.set(indexPersonToUpdate, new Person(uuid, update.getName(), update.getAddress()));
                        return 1;
                    }
                        return 0;
                })
                .orElse(0);
    }


}

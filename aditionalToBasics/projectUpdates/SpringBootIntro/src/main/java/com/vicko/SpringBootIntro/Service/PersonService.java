package com.vicko.SpringBootIntro.Service;

import com.vicko.SpringBootIntro.DAO.PersonDAO;
import com.vicko.SpringBootIntro.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {

    private final PersonDAO personDAO;

    // Para hacer la inyección de una implementación sobre una interfaz de repositorio tenemos que usar el siguiente identificado
    // En caso de tener multiples implementaciónes de dicha interfaz se puede utilizar un atributo en los parametros del constructor para generarle una distinción
    @Autowired
    public PersonService(@Qualifier("PostgresDB") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    public int addPerson(Person person){
        return personDAO.insertPerson(person);
    }

    public List<Person> getPeople(){
        return personDAO.selectPeople();
    }

    public Optional<Person> selectPeopleById(UUID id){
        return personDAO.selectPersonById(id);
    }

    public int deletePersonById(UUID id){
        return personDAO.deletePersonById(id);
    }

    public int updatePersonById(UUID id, Person person){
        return personDAO.updatePersonbyId(id, person);
    }
}

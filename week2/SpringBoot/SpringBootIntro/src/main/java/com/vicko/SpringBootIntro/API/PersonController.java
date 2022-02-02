package com.vicko.SpringBootIntro.API;

import com.vicko.SpringBootIntro.Model.Person;
import com.vicko.SpringBootIntro.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Para que las request de la API tengan la misma ruta podemos utilizar

//Para que esta clase sirva para controlar las request usando APIs tenemos que usar el siguiente identificador
@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    //Por ejemplo si queremos que este metodo sirva para cuando se use un GET

    // Para obtener la info del cuerpo Json que se envie mediante la API, podemos usar lo siguiente
    @PostMapping
    public void addPerson(@Valid @NotNull @RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getPeople(){
        return personService.getPeople();
    }

    @GetMapping(path = "{id}")
    // Como aca nececitamos de especificar sobre algo especifico (un id como tal), necesitamos especificar el path del id
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.selectPeopleById(id).orElse(null);
    }


    @DeleteMapping(path = "{id}")
    public int deletePersonById(@PathVariable("id") UUID id){
        return personService.deletePersonById(id);
    }

    @PutMapping(path = "{id}")
    public int updatePersonById(@PathVariable("id") UUID id,@Valid @NotNull @RequestBody Person person){
        return personService.updatePersonById(id, person);
    }
}

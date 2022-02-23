package com.vicko.SpringBootIntro.DAO;

import com.vicko.SpringBootIntro.Model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Podemos hacer ditintas injecciones de dependencias que tengamos si usamos repositorios
@Repository("PostgresDB")
public class PersonDataAccessSerive implements PersonDAO{

    private final JdbcTemplate jdbcTemplate;

    public PersonDataAccessSerive(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


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
        final String qry = "SELECT id,name FROM person";
        return jdbcTemplate.query(qry, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(
                    id,
                    name
            );
        });
    }

    @Override
    public Optional<Person> selectPersonById(UUID uuid) {
        final String qry = "SELECT id, name FROM person WHERE id = ?";

        Person person = jdbcTemplate.queryForObject(qry, new Object[]{uuid} , (resultSet, i)-> {
            UUID Personid = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(Personid, name);
        });

        return Optional.ofNullable(person);
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

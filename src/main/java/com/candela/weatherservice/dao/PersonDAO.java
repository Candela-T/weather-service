package com.candela.weatherservice.dao;

import com.candela.weatherservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository// Es el package que contiene las interfaces que extienden de JPA
// para que estas clases se conecten a la base de datos.
public interface PersonDAO extends JpaRepository<Person, Long> {

    Person findByName(String name);

    Person findByAge(Integer age);

    List<Person> findByLastname(String lastname);

    Person findById(long id);

}

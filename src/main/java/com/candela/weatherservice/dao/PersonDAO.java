package com.candela.weatherservice.dao;

import com.candela.weatherservice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {

    Person findByName(String name);//spring data me crea una consulta sql que se ejecuta cuando ejecuto el metodo para
    //buscar a una persona por nombre

    Person findByAge(Integer age);

    List<Person> findByLastname(String lastname);

    Person findById(long id);


}

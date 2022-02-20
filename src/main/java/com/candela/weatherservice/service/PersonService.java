package com.candela.weatherservice.service;

import com.candela.weatherservice.dao.PersonDAO;
import com.candela.weatherservice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {//en esta clase van los metodos y la logica. estos metodos después son usados
    //en el controller dentro de los endpoints

    @Autowired
    PersonDAO personDAO;







    public Person getPerson(int age){

        return personDAO.findByAge(age);
    }

    public void addPerson(Person person){

        personDAO.save(person);

    }

    public List<Person> getPersons(){

        List<Person>  personList = personDAO.findAll();

        if (personList.isEmpty())

            throw new NullPointerException("No persons found in database");

        else

            return personList;
    }

    public void deletePerson(long id) {

        personDAO.deleteById(id);
    }

    public void putPerson(Person p) {

        if(personDAO.findByAge(p.getAge()) != null){
            personDAO.save(p);
        }

    }
}



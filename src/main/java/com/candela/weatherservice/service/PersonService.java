package com.candela.weatherservice.service;

import com.candela.weatherservice.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {//en esta clase van los metodos y la logica. estos metodos después son usados
    //en el controller dentro de los endpoints

    private List<Person> list;//declaro el atributo de tipo person

    public Person getPerson(String name){//1er metodo para traer a alguien de la lista

        List<Person> filteredList = list.stream().filter(person ->
                person.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

        return filteredList.get(0);//retorna la lista en la posicion 0 porque tiene que haber una unica persona
        //almacenada o puede ser que no la encuentre y este vacía(en este caso con un try-catch atrtapo la
        //excepcion en el controller
    }

    public void addPerson(Person person){//2do metodo para añadir una persona a la lista

        if (list != null)
            list.add(person);
        else {
            list = new ArrayList<>();
            list.add(person);
        }

    }

    public List<Person> getPersons(){
        return list;
    }

    public void deletePerson(String name) {

        list.removeIf(person -> person.getName().equals(name));
        //removeIf remueve un elemento de la lista al mismo tiempo que la recorre sin necesidad
        //de usar un Iterator
    }

    public void putPerson(Person p) {
    boolean found = false;

        for (Person person : list) {
            if (person.getId() == p.getId()) {
                person.setName(p.getName());
                person.setAge(p.getAge());
                person.setLastName(p.getLastName());
                found = true;
            }
        }
        if(!found){
            throw new IllegalArgumentException();
        }
    }
}



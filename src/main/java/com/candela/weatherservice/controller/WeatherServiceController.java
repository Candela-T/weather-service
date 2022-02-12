package com.candela.weatherservice.controller;


import com.candela.weatherservice.dto.ResponseDTO;
import com.candela.weatherservice.model.Person;
import com.candela.weatherservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController//indica que es el controlador
public class WeatherServiceController {

    @Autowired//permite inyectar unas dependencias con otras dentro de Spring
    private PersonService personService;

    @GetMapping("/person/{name}")//sirve para indicar que el metodo anotado es un endpoint dentro de la
    // clase controller que recibe peticiones Get
    public ResponseEntity<Object> getPersonInfo(@PathVariable(value = "name") String name){//pathVariable-->para
    // configurar variables dentro de los propios segmentos de la URL
    //"ResponseEntity"es una clase de SPRING para devolver respuestas en una API
        try{

            Person person = personService.getPerson(name);
            return new ResponseEntity<>(person, HttpStatus.OK);

        } catch(IndexOutOfBoundsException e){//atrapo la excepcion que puede derivar en el caso de que este
            //vacia la lista de personas  y devuelva un elemento que no existe

            return new ResponseEntity<>(
                    new ResponseDTO(HttpStatus.NOT_FOUND.value(), "ERROR. PERSON NOT FOUND."),
                    HttpStatus.NOT_FOUND);//en vez de mandarle una persona con la clase responseDTO y haciendo
            // uso del constructor parametrizado envio un mensj y el httpStatus

        }
    }

    @PostMapping("/person")//sirve para indicar que es un endpoint de tipo post
    public ResponseEntity<Object> postPerson(@RequestBody Person person){

        personService.addPerson(person);//llamo al metodo declarado en el servicio
        return new ResponseEntity<>(//retorno una nueva respuesta
                new ResponseDTO(HttpStatus.CREATED.value(),
                        "THE PERSON WAS CREATED SUCCESSFULLY."), HttpStatus.CREATED);
    }

    @GetMapping("/persons")
    public ResponseEntity<Object> getPersons(){

        return new ResponseEntity<>( personService.getPersons(), HttpStatus.OK);
    }

    @DeleteMapping("/person/{name}")
    public ResponseEntity<Object> deletePerson(@PathVariable(value = "name") String name){
        personService.deletePerson(name);
        return new ResponseEntity<>(
                new ResponseDTO(HttpStatus.OK.value(),//responseDTO es un json
                "The person was deleted successfully."),HttpStatus.OK);
    }
//usar un body con json que corresponde a una persona
    @PutMapping("/person")
    public ResponseEntity<Object> putPerson(@RequestBody Person person) {
        try {
            personService.putPerson(person);
            return new ResponseEntity<>(
                    new ResponseDTO(HttpStatus.CREATED.value(),
                            "The person was modified correctly."), HttpStatus.CREATED
            );
        } catch (IllegalArgumentException i) {
            return new ResponseEntity<>(
                    new ResponseDTO(HttpStatus.NOT_FOUND.value(),
                            "The person does not exists"), HttpStatus.NOT_FOUND
            );
        }
    }
 }

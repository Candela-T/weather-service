package com.candela.weatherservice.controller;


import com.candela.weatherservice.dto.ResponseDTO;
import com.candela.weatherservice.model.Person;
import com.candela.weatherservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherServiceController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{age}")
    public ResponseEntity<Object> getPersonInfo(@PathVariable(value = "age") int age){

        try{

            Person person = personService.getPerson(age);
            return new ResponseEntity<>(person, HttpStatus.OK);

        } catch(IndexOutOfBoundsException e){

            return new ResponseEntity<>(
                    new ResponseDTO(HttpStatus.NOT_FOUND.value(), "ERROR. PERSON NOT FOUND."),
                    HttpStatus.NOT_FOUND);


        }
    }

    @PostMapping("/person")
    public ResponseEntity<Object> postPerson(@RequestBody Person person){

        personService.addPerson(person);
        return new ResponseEntity<>(
                new ResponseDTO(HttpStatus.CREATED.value(),
                        "THE PERSON WAS CREATED SUCCESSFULLY."), HttpStatus.CREATED);
    }

    @GetMapping("/persons")
    public ResponseEntity<Object> getPersons(){

        return new ResponseEntity<>( personService.getPersons(), HttpStatus.OK);
    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<Object> deletePerson(@PathVariable(value = "id") long id){
        personService.deletePerson(id);
        return new ResponseEntity<>(
                new ResponseDTO(HttpStatus.OK.value(),
                "The person was deleted successfully."),HttpStatus.OK);
    }

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

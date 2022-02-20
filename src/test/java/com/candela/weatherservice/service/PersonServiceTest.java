package com.candela.weatherservice.service;

import com.candela.weatherservice.dao.PersonDAO;
import com.candela.weatherservice.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @InjectMocks
    PersonService personService;

    @Mock
    PersonDAO personDAO;

    @Test
    public void getPersonsOk(){

        List<Person> personMockList = List.of(new Person(), new Person(), new Person());

        when(personDAO.findAll()).thenReturn(personMockList);

        assertEquals(3, personService.getPersons().size());

    }

    @Test
    public void getPersonsNotFound(){

        List<Person> personMockList = new ArrayList<>();

        when(personDAO.findAll()).thenReturn(personMockList);

        assertThrows(NullPointerException.class, () -> personService.getPersons());

    }


}

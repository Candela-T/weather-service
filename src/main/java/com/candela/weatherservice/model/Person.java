package com.candela.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity// es una clase de Java ligera, cuyo estado es persistido
// de manera asociada a una tabla en una base de datos relacional
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)//autoincremental
    private Long id;

    private String name;

    private String lastname;

    private Integer age;

}


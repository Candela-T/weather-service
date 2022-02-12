package com.candela.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//declaro que esta clase es mapeada a la tabla person(bd)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {//solo declaro los atributos. lombok se encarga de crear los constructores, getters/setters
    //toString
    @Id//significa que ese atributo es mi primary key
    @GeneratedValue(strategy  = GenerationType.IDENTITY)//autoincremental
    private Long id;

    private String name;

    private String lastname;

    private Integer age;



}


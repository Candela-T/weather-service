package com.candela.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {//solo declaro los atributos. lombok se encarga de crear los constructores, getters/setters
    //toString

    private String name;
    private String lastName;
    private int age;
    private int id;

}

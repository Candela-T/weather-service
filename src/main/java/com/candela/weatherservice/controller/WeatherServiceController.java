package com.candela.weatherservice.controller;

import com.candela.weatherservice.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceController {

    @GetMapping("/name-service")
    public ResponseEntity<Response> getName(@RequestParam("name") String name) {

        Response response = new Response();
        response.setName(name);
        return new ResponseEntity<Response>(response, HttpStatus.OK);

    }
 }

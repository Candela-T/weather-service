package com.candela.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int weatherDataId;
    private LocalDateTime weatherDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;//necesita una anotacion joinColumn?
    @OneToMany(mappedBy="weatherData")
    private List<WeatherDataTemperature> weatherDataTemperature;
}

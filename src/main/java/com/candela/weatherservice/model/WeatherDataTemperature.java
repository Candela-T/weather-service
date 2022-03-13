package com.candela.weatherservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "weather_data_temperature")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDataTemperature {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int weatherDataTemperatureId;
    @ManyToOne
    @JoinColumn(name="weather_data_id", nullable=false)
    private WeatherData weatherData;
    private double temperature;

}

-- data.sql --> aloja la creacion de las tablas

CREATE TABLE location
(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
lat DOUBLE,
lon DOUBLE,
city VARCHAR(45),
state VARCHAR(45)
);


CREATE TABLE weather_data
(
weather_data_id BIGINT PRIMARY KEY AUTO_INCREMENT,
weather_date DATE,
location_id BIGINT,
FOREIGN KEY (location_id) references location(id)
-- falta referencia a weather data temperature (?)
);

CREATE TABLE weather_data_temperature
(
weather_data_temperature_id BIGINT PRIMARY KEY AUTO_INCREMENT,
weather_data_id BIGINT,
temperature DOUBLE,
FOREIGN KEY (weather_data_id) references weather_data(weather_data_id)
);


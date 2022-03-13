-- import.sql aloja la insercion de los datos en las columnas de la tabla

INSERT INTO location(lat, lon, city, state) VALUES ( 10.78, 50.98, 'Albuquerque' , 'Nuevo Mexico' );
INSERT INTO location(lat, lon, city, state)  VALUES ( 3.54, 19.72, 'Los Angeles' , 'California' );
INSERT INTO location(lat, lon, city, state) VALUES ( 34.76, 12.80, 'Chicago' , 'Illinois' );
INSERT INTO location(lat, lon, city, state) VALUES ( 4.50, 23.55, 'Columbus' , 'Ohio' );
INSERT INTO location(lat, lon, city, state) VALUES ( 98.52, 99.76, 'Denver' , 'Colorado' );

INSERT INTO weather_data(weather_date, location_id) VALUES ('2022-01-21', 1);
INSERT INTO weather_data(weather_date, location_id) VALUES ('2022-01-22', 2);
INSERT INTO weather_data(weather_date, location_id) VALUES ('2022-01-23', 3);
INSERT INTO weather_data(weather_date, location_id) VALUES ('2022-01-24', 4);
INSERT INTO weather_data(weather_date, location_id) VALUES ('2022-01-25', 5);

INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 1, 23.70 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 1, 90.40 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 1, 21.99 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 1, 43.80 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 2, 27.45 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 2, 13.60 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 2, 46.30 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 2, 29.88 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 3, 77.60 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 3, 85.74 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 3, 84.80 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 3, 11.40 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 4, 96.88 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 4, 22.22 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 4, 66.90 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 4, 77.00 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 5, 43.40 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 5, 98.88 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 5, 33.30 );
INSERT INTO weather_data_temperature(weather_data_id, temperature) VALUES ( 5, 93.90 );

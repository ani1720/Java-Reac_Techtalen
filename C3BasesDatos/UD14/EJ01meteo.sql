CREATE DATABASE meteo;
CREATE TABLE estacion ( id MEDIUMINT UNSIGNED NOT NULL, 
lat VARCHAR(14) NOT NULL, 
longitud VARCHAR(15) NOT NULL, 
alt MEDIUMINT NOT NULL, 
PRIMARY KEY (id));
​
CREATE TABLE muestra (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    idestacion MEDIUMINT UNSIGNED NOT NULL,
    fecha DATE NOT NULL,
    temin TINYINT,
    temax TINYINT,
    precip SMALLINT UNSIGNED,
    humin TINYINT UNSIGNED,
    humax TINYINT UNSIGNED,
    vemin SMALLINT UNSIGNED,
    vemax SMALLINT UNSIGNED,
    KEY (idestacion), FOREIGN KEY (idestacion) 
    REFERENCES estacion (id) 
        ON DELETE NO ACTION 
        ON UPDATE CASCADE);

-- Añadir datos a la tabla estacion y muestra completando los valores de las estaciones y las muestras de datos meteorológicos.

INSERT INTO estacion (lat, longitud, alt) 
VALUES
('40.7128N', '74.0060W', 10),    -- Nueva York, EE.UU.
('34.0522N', '118.2437W', 89),   -- Los Ángeles, EE.UU.
('51.5074N', '0.1278W', 35),     -- Londres, Reino Unido
('35.6895N', '139.6917E', 40),   -- Tokio, Japón
('48.8566N', '2.3522E', 35);     -- París, Francia



-- Asumiendo que las estaciones tienen id 1 a 4 en orden de inserción

INSERT INTO muestra (idestacion, fecha, temin, temax, precip, humin, humax, vemin, vemax) 
VALUES
(1, '2025-05-18', 12.3, 24.7, 0.0, 45, 78, 3.2, 7.5),
(2, '2025-05-18', 9.5, 21.4, 2.1, 52, 85, 2.0, 5.6),
(3, '2025-05-18', 15.0, 28.3, 0.0, 40, 70, 1.8, 4.3),
(4, '2025-05-18', 8.2, 19.6, 5.4, 60, 90, 4.0, 8.1),
(5, '2025-05-18', 11.6, 22.0, 0.3, 48, 76, 2.5, 6.0);

-- Me he dado cuenta que quizás la estación debe tener nombre:

ALTER TABLE estacion
ADD nombre VARCHAR(20) AFTER id;


-- Actualizar los nombres de las estaciones

UPDATE estacion SET nombre = 'Nueva York' WHERE id = 1;
UPDATE estacion SET nombre = 'Los Angeles' WHERE id = 2;
UPDATE estacion SET nombre = 'Londres' WHERE id = 3;
UPDATE estacion SET nombre = 'Tokio' WHERE id = 4;
UPDATE estacion SET nombre = 'Paris' WHERE id = 5;

-- Elimino una estación 2 para mostrar el ON DELETE NO ACTION
--Primero la muestra relacionada con la estación:
--DELETE FROM muestra WHERE `muestra`.`id` = 3;
--Luego la estación:
--DELETE FROM estacion WHERE `estacion`.`id` = 2;

-- Actualizo la estación de Valencia:
--UPDATE `estacion` SET `id` = '7' WHERE `estacion`.`id` = 3;
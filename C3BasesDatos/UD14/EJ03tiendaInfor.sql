CREATE DATABASE tiendainfoR;
USE tiendainfoR;

CREATE TABLE fabricantes (
    codigo INT(11) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo));

--ALTER TABLE `fabricantes` CHANGE `codigo` `codigo` INT(11) NOT NULL AUTO_INCREMENT;

INSERT INTO `fabricantes` (`codigo`, `nombre`) VALUES (NULL, 'HP');
INSERT INTO fabricantes (nombre) VALUES ('LG');


CREATE TABLE articulos (
    codiart INT(15) NOT NULL  AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio FLOAT,
    fabricante INT,
    PRIMARY KEY (codiart),
    FOREIGN KEY (fabricantes) 
    REFERENCES fabricantes (codigo) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);


--Ejemplo de phpMyAdmin

--CREATE TABLE `tiendainfo`.`prova` (`id` INT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(60) NOT NULL , PRIMARY KEY (`id`));

-- Insert fabricantes
INSERT INTO fabricantes (nombre) VALUES
('TechCorp'),
('GigaSystems'),
('Alpha Electronics'),
('NovaTech'),
('Electronix'),
('FuturaLabs'),
('ByteWorks'),
('Quantum Devices'),
('Smart Solutions'),
('NextGen');

-- Insert articulos
INSERT INTO articulos (nombre, precio, fabricante) VALUES
('Monitor 24 pulgadas', 150.00, 1),
('Teclado mecánico', 85.50, 2),
('Mouse inalámbrico', 40.75, 3),
('Impresora láser', 220.00, 4),
('Router WiFi 6', 120.99, 5),
('Disco duro SSD 1TB', 180.00, 6),
('Memoria RAM 16GB', 75.25, 7),
('Cámara web HD', 60.00, 8),
('Altavoces Bluetooth', 45.00, 9),
('Tablet 10 pulgadas', 250.00, 10);

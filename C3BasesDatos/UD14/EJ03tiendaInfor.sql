CREATE DATABASE tiendainfoR;
USE tiendainfoR;

CREATE TABLE fabricantes (
    codigo INT(11) NOT NULL AUTO_INCREMENT;,
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
    FOREIGN KEY (fabricante) 
    REFERENCES fabricantes (codigo) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);


--Ejemplo de phpMyAdmin

--CREATE TABLE `tiendainfo`.`prova` (`id` INT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(60) NOT NULL , PRIMARY KEY (`id`));
CREATE DATABASE empleadepart;
USE empleadepart;

CREATE TABLE departamentos (
    codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    presupuesto INT,
    PRIMARY KEY (codigo));

CREATE TABLE empleados (
    dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(255),
    departamento INT,
    PRIMARY KEY (dni),
    FOREIGN KEY (departamento) 
    REFERENCES departamentos (codigo) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);
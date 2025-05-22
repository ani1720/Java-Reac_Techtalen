CREATE DATABASE piezprov;
USE piezprov;

CREATE TABLE piezas (
    codigo INT UNSIGNED AUTO_INCREMENT ,
    nom VARCHAR (100) NOT NULL,
    PRIMARY KEY(codigo));

CREATE TABLE proveedores (
    idprov INT UNSIGNED AUTO_INCREMENT ,
    nombre VARCHAR (100) NOT NULL,
    PRIMARY KEY(idprov));

CREATE TABLE suministra (
    codigo INT UNSIGNED,
    idprov INT UNSIGNED,
    precio FLOAT NOT NULL,
    PRIMARY KEY(codigo,idprov),
    FOREIGN KEY (codigo) 
    REFERENCES piezas (codigo) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (idprov) 
    REFERENCES proveedores (idprov) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);



-- Crear base de datos opcionalmente
DROP DATABASE IF EXISTS cine;
CREATE DATABASE cine;
USE cine;

-- Crear tabla peliculas
CREATE TABLE peliculas (
    codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    caliedad INT NOT NULL,
    PRIMARY KEY(codigo)
) ENGINE=InnoDB;

-- Crear tabla salas
CREATE TABLE salas (
    codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    pelicula INT NULL,  -- Permitir NULL para que ON DELETE SET NULL funcione
    PRIMARY KEY(codigo),
    FOREIGN KEY (pelicula) 
        REFERENCES peliculas (codigo) 
        ON DELETE SET NULL 
        ON UPDATE CASCADE
) ENGINE=InnoDB;

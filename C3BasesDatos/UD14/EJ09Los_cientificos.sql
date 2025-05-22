DROP DATABASE IF EXISTS los_cientificos;
CREATE DATABASE los_cientificos;
USE los_cientificos;

-- Tabla cientificos
CREATE TABLE cientificos (
    dni VARCHAR(9) NOT NULL,
    nombre VARCHAR(100),
    PRIMARY KEY (dni)
) ENGINE=InnoDB;

-- Tabla proyectos
CREATE TABLE proyectos (
    id INT UNSIGNED AUTO_INCREMENT,
    nombre VARCHAR(100),
    horas INT,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

-- Tabla asigado (intermedia)
CREATE TABLE asigado (
    dni VARCHAR(9) NOT NULL,
    id INT UNSIGNED NOT NULL,
    PRIMARY KEY (dni, id),
    FOREIGN KEY (dni)
        REFERENCES cientificos (dni)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (id)
        REFERENCES proyectos (id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;



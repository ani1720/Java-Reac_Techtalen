CREATE DATABASE academia;
USE academia;

CREATE TABLE profesores(
    dni VARCHAR(9),
    nombre VARCHAR (255),
    apel1 VARCHAR (255),
    apel2 VARCHAR (255),
    direccion VARCHAR(100),
    titulacion VARCHAR(50),
    sueldo SMALLINT NOT NULL,
    UNIQUE (nombre, apel1, apel2),
    PRIMARY KEY (dni));

CREATE TABLE curso (
    cod INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    horas INT NOT NULL,
    fechainicio DATE,
    fechafin DATE,
    maxalumn INT,
    dni_p VARCHAR(9),

    PRIMARY KEY (cod),
    UNIQUE (nombre),

    FOREIGN KEY (dni_p)
        REFERENCES profe (dni)
        ON DELETE SET NULL
        ON UPDATE CASCADE,

    CONSTRAINT chk_fechas CHECK (fechainicio <= fechafin)
) ENGINE=InnoDB;

CREATE TABLE alumnos(
    nombre VARCHAR (200),
    apel1 VARCHAR (200),
    apel2 VARCHAR (200),
    dni VARCHAR(9),
    direccion VARCHAR(100),
    nace DATE,
    sexo CHAR CHECK (sexo IN ('H', 'M')),
    codalum INT,
    UNIQUE (nombre),
    PRIMARY KEY (dni),
    FOREIGN KEY (codalum) 
    REFERENCES curso (cod)
    ON DELETE CASCADE 
    ON UPDATE CASCADE);
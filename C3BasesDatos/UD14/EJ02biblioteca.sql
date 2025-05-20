CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

-- Tabla editorial
CREATE TABLE editorial (
    claveditorial SMALLINT UNSIGNED NOT NULL,
    nombre VARCHAR(50),
    direccion VARCHAR(60),
    telefono VARCHAR(15),
    PRIMARY KEY (claveditorial)
) ENGINE=InnoDB;

-- Tabla tema
CREATE TABLE tema (
    clavetema SMALLINT NOT NULL,
    nombre VARCHAR(40),
    PRIMARY KEY (clavetema)
) ENGINE=InnoDB;

-- Tabla autor
CREATE TABLE autor (
    claveautor INT NOT NULL,
    nombre VARCHAR(60),
    PRIMARY KEY (claveautor)
) ENGINE=InnoDB;

-- Tabla socio
CREATE TABLE socio (
    clavesocio INT NOT NULL,
    nombre VARCHAR(60),
    direccion VARCHAR(60),
    telefono VARCHAR(15),
    categoria CHAR(1),
    PRIMARY KEY (clavesocio)
) ENGINE=InnoDB;

-- Tabla libro
CREATE TABLE libro (
    clavelibro INT NOT NULL, 
    titulo VARCHAR(60), 
    idioma VARCHAR(15), 
    formato VARCHAR(15),    
    claveditorial SMALLINT UNSIGNED,
    PRIMARY KEY (clavelibro),
    FOREIGN KEY (claveditorial) 
        REFERENCES editorial (claveditorial)
        ON DELETE SET NULL
        ON UPDATE CASCADE
) ENGINE=InnoDB;

-- Tabla ejemplar
CREATE TABLE ejemplar (
    clavejemplar INT NOT NULL,
    clavelibro INT NOT NULL,
    numerorden SMALLINT NOT NULL,
    edicion SMALLINT, 
    ubicacion VARCHAR(15),
    categoria CHAR(1), 
    PRIMARY KEY (clavejemplar),
    FOREIGN KEY (clavelibro)
        REFERENCES libro (clavelibro)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;

-- Tabla escritopor (relación muchos a muchos)
CREATE TABLE escritopor (
    clavelibro INT NOT NULL,
    claveautor INT NOT NULL,
    PRIMARY KEY (clavelibro, claveautor),
    FOREIGN KEY (clavelibro)
        REFERENCES libro (clavelibro)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (claveautor)
        REFERENCES autor (claveautor)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;

-- Tabla tratasobre (relación muchos a muchos)
CREATE TABLE tratasobre (
    clavelibro INT,
    clavetema SMALLINT NOT NULL,
    PRIMARY KEY (clavelibro, clavetema),
    FOREIGN KEY (clavelibro)
        REFERENCES libro (clavelibro)
        ON DELETE SET NULL
        ON UPDATE CASCADE,
    FOREIGN KEY (clavetema)
        REFERENCES tema (clavetema)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;

-- Tabla prestamo
CREATE TABLE prestamo (
    clavesocio INT,
    clavejemplar INT,
    numerorden SMALLINT,
    fechaprestamo DATE NOT NULL,
    fechadevolucion DATE DEFAULT NULL,
    notas BLOB,
    PRIMARY KEY (clavesocio, clavejemplar, fechaprestamo),
    FOREIGN KEY (clavesocio)
        REFERENCES socio (clavesocio)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (clavejemplar)
        REFERENCES ejemplar (clavejemplar)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO editorial (claveditorial, nombre, direccion, telefono) VALUES
(1, 'Planeta', 'Av. Siempre Viva 123', '123456789'),
(2, 'Santillana', 'Calle Falsa 456', '987654321');

INSERT INTO tema (clavetema, nombre) VALUES
(1, 'Ficción'),
(2, 'Historia'),
(3, 'Ciencia');

INSERT INTO autor (claveautor, nombre) VALUES
(1, 'Gabriel García Márquez'),
(2, 'Isaac Asimov'),
(3, 'Julio Cortázar');

INSERT INTO socio (clavesocio, nombre, direccion, telefono, categoria) VALUES
(1, 'Ana López', 'Av. del Sol 101', '111222333', 'A'),
(2, 'Carlos Pérez', 'Calle Luna 202', '444555666', 'B');

INSERT INTO libro (clavelibro, titulo, idioma, formato, claveditorial) VALUES
(100, 'Cien Años de Soledad', 'Español', 'Tapa dura', 1),
(101, 'Fundación', 'Inglés', 'Rústica', 2),
(102, 'Rayuela', 'Español', 'Tapa blanda', 1);

INSERT INTO ejemplar (clavejemplar, clavelibro, numerorden, edicion, ubicacion, categoria) VALUES
(1, 100, 1, 1, 'A1', 'N'),
(2, 101, 1, 2, 'B3', 'C'),
(3, 102, 1, 1, 'A2', 'N');

INSERT INTO escritopor (clavelibro, claveautor) VALUES
(100, 1), -- García Márquez escribió Cien Años de Soledad
(101, 2), -- Asimov escribió Fundación
(102, 3); -- Cortázar escribió Rayuela

INSERT INTO tratasobre (clavelibro, clavetema) VALUES
(100, 1), -- Ficción
(101, 3), -- Ciencia
(102, 1); -- Ficción

INSERT INTO prestamo (clavesocio, clavejemplar, numerorden, fechaprestamo, fechadevolucion, notas) VALUES
(1, 1, 1, '2025-05-01', '2025-05-10', 'Prestado sin daños'),
(2, 2, 1, '2025-05-05', NULL, 'Pendiente devolución');


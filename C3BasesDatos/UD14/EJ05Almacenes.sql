-- Crear la base de datos
DROP DATABASE IF EXISTS almacenes;
CREATE DATABASE almacenes;
USE almacenes;

-- Crear tabla almacenes
CREATE TABLE almacenes (
    codigo INT UNSIGNED AUTO_INCREMENT,
    lugar VARCHAR(100) NOT NULL,
    capacidad INT,
    PRIMARY KEY (codigo)
) ENGINE=InnoDB;

-- Crear tabla cajas
CREATE TABLE cajas (
    NumReferencia CHAR(5),
    contenido VARCHAR(100),
    valor FLOAT,
    codigo INT UNSIGNED,
    PRIMARY KEY (NumReferencia),
    FOREIGN KEY (codigo) 
    REFERENCES almacen(codigo)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB;

-- Insertar datos en almacenes
INSERT INTO almacenes (lugar, capacidad) VALUES
('Madrid', 1000),
('Barcelona', 800),
('Valencia', 600),
('Sevilla', 750),
('Bilbao', 500);

-- Insertar datos en cajas
INSERT INTO cajas (NumReferencia, contenido, valor, codigo) VALUES
('A0001', 'Libros', 120.50, 1),
('A0002', 'Electrónica', 950.00, 2),
('A0003', 'Ropa', 350.75, 3),
('A0004', 'Juguetes', 210.40, 4),
('A0005', 'Papelería', 85.00, 1);

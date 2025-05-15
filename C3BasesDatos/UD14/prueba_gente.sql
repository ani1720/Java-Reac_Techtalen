USE prueba_gente;

DROP TABLE IF EXISTS gente;

CREATE TABLE gente 
( id_gente INT AUTO_INCREMENT,
 nombre VARCHAR(20),
edad INT,
ciudad VARCHAR(20),
 fecha DATE,
 salario FLOAT,
 PRIMARY KEY (id_gente)
 );
  -- tabla 2
  USE prueba_gente;
CREATE TABLE clientes (
id_cliente INT PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL,
 email VARCHAR(100) UNIQUE,
 telefono VARCHAR(15),
 fecha_registro DATE DEFAULT CURRENT_DATE
);
--Tabla 3
USE prueba_gente;
CREATE TABLE pedidos(
    id_pedido INT PRIMARY KEY,
    fecha DATE NOT NULL,
    total DECIMAL(10,2) NOT NULL CHECK (total >=0),
    id_cliente INT NOT NULL,
    
)

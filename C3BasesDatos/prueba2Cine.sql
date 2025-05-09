-- 1. Realizar una consulta que muestre los campos “Empresa” y “Población” de la tabla "Clientes". 
SELECT * FROM clientes;

SELECT EMPRESA,POBLACIÓN FROM clientes;

-- 2. Realizar una consulta que muestre los artículos de la sección “Cerámica”. 
SELECT NOMBREARTÍCULO AS `ARTÍCULOS DE CERÁMICA` FROM PRODUCTOS WHERE SECCIÓN='CERÁMICA';

-- 3. Realizar una consulta que muestre los productos de la sección “Deportes” cuyo precio esté entre 100 y 200 €. 
-- En la consulta solo se mostrarán los campos “Nombre de artículo” y “Precio”. 

SELECT NOMBREARTÍCULO AS `DEPORTES`, PRECIO AS `ENTRE 100 y 200€` FROM PRODUCTOS WHERE SECCIÓN="DEPORTES" AND PRECIO BETWEEN 100 AND 200;

-- 4. Realizar una consulta que muestre los productos cuyo país no sea España. 

SELECT * FROM PRODUCTOS WHERE PAÍSDEORIGEN <> "ESPAÑA";
SELECT * FROM PRODUCTOS WHERE IMPORTADO = "TRUE";
SELECT * FROM PRODUCTOS WHERE PAÍSDEORIGEN IS NOT 'ESPAÑA';
SELECT * FROM PRODUCTOS WHERE PAÍSDEORIGEN != 'ESPAÑA';

-- 5. Realizar una consulta que muestre los artículos españoles de la sección “Deportes” o aquellos cuyo precio sea superior a 350 € independientemente de cual sea su sección o país de origen. 

SELECT * 
FROM PRODUCTOS 
WHERE (SECCIÓN="DEPORTES" AND PAÍSDEORIGEN = "ESPAÑA")
OR 
PRECIO > 350;

--Creacion de una tabla
CREATE TABLE Peliculas ( id_pelicula INT PRIMARY KEY, titulo VARCHAR(100) NOT NULL, duracion INT, edad_recomendada INT );
SELECT * FROM `peliculas`
ALTER TABLE Peliculas ADD director VARCHAR(100);

-- Modificacion de una tabla 
ALTER TABLE Peliculas 
DROP COLUMN edad_recomendada;

ALTER TABLE Peliculas
MODIFY duracion SMALLINT;

--Vaciar una tabla
TRUNCATE TABLE Peliculas;

--Eliminar una tabla y base de datos
DROP TABLE Peliculas;
DROP DATABASE CINE;

--Ejercicio 06
-- Realizar una consulta que muestre los productos 
--cuya fecha esté entre 1/05/2001 y 15/12/2001. 
--En la consulta solo se visualizarán los campos
-- “Nombre de artículo”, “Sección” y “Fecha”
SELECT * FROM productos WHERE FECHA BETWEEN '2002-02-01' AND '2002-05-31' ORDER BY NOMBREARTÍculo DESC;
SELECT * FROM productos WHERE FECHA BETWEEN '2002-02-01' AND '2002-05-31' ORDER BY NOMBREARTÍculo DESC;
SELECT * FROM `productos`
SELECT * FROM `productos` ORDER BY `FECHA` ASC

--CLAUSULA GRUP BY 
SELECT * FROM `clientes`
SELECT POBLACIÓN FROM `clientes`GROUP BY POBLACIÓN;

SELECT * FROM `productos`
SELECT SECCIÓN FROM `productos` GROUP BY SECCIÓN;
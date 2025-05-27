-- Insert fabricantes
INSERT INTO fabricantes (nombre) VALUES
('TechCorp'),
('GigaSystems'),
('Alpha Electronics'),
('NovaTech'),
('Electronix'),
('FuturaLabs'),
('ByteWorks'),
('Quantum Devices'),
('Smart Solutions'),
('NextGen');

-- Insert articulos
INSERT INTO articulos (nombre, precio, fabricante) VALUES
('Monitor 24 pulgadas', 150.00, 1),
('Teclado mecánico', 85.50, 2),
('Mouse inalámbrico', 40.75, 3),
('Impresora láser', 220.00, 4),
('Router WiFi 6', 120.99, 5),
('Disco duro SSD 1TB', 180.00, 6),
('Memoria RAM 16GB', 75.25, 7),
('Cámara web HD', 60.00, 8),
('Altavoces Bluetooth', 45.00, 9),
('Tablet 10 pulgadas', 250.00, 10);

--CONSULTAS
--1
SELECT nombre FROM articulos;
--2
SELECT nombre, precio FROM articulos;
--3
SELECT * FROM articulos 
WHERE nombre = (precio <=200);
SELECT * FROM articulos 
WHERE nombre = (precio >=200);
--4
SELECT * FROM articulos
 WHERE precio BETWEEN 60 AND 120;
--5
SELECT 
    nombre,
    precio,
    precio * 166.386 AS precio_en_pesetas
FROM 
    articulos;
--6
SELECT AVG(precio) AS preciomedio
FROM articulos;
--7
SELECT AVG(precio) AS precio_medio
FROM articulos
WHERE fabricante = 2; 
--Plus 7
SELECT 
    fabricante, 
    ROUND(AVG(precio), 2) AS precio_medio
FROM 
    articulos
WHERE 
    fabricante = 2
GROUP BY 
    fabricante;
    --8
    SELECT * FROM articulos 
    WHERE nombre = (precio >=180);
--9
SELECT * FROM articulos 
    WHERE nombre = (precio >=180)
    ORDER BY precio DESC;

    SELECT * FROM articulos 
    WHERE nombre = (precio >=180)
    ORDER BY nombre ASC;
--10
SELECT a.nombre, f.nombre
FROM articulos a
JOIN fabricantes f
ON a.fabricante = f.codigo;

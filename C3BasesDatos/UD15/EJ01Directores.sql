INSERT INTO despachos (capacidad) VALUES
(4), --NUM1
(6), --NUM2
(8), --NUM3
(10), --NUM4
(3), --NUM5
(5), --NUM6
(7), --NUM7
(3), --NUM8
(6), --NUM9
(5);--NUM10

-- Insertamos primero a los directores sin jefe
INSERT INTO directores (DNI,
 NomApels, 
 DNIJefe, 
 despacho) 
 VALUES
('11111111A', 'María López', NULL, 1),
('22222222B', 'Juan Pérez', NULL, 2);

-- Insertamos a los demás con sus jefes ya insertados
INSERT INTO directores (DNI, 
NomApels, 
DNIJefe,
 despacho) 
 VALUES
('33333333C', 'Laura Sánchez', '11111111A', 3),
('44444444D', 'Carlos Ruiz', '11111111A', 4),
('55555555E', 'Ana Martínez', '22222222B', 5),
('66666666F', 'Lucía Gómez', '22222222B', 6),
('77777777G', 'Pedro Romero', '33333333C', 7),
('88888888H', 'Marta Torres', '44444444D', 8),
('99999999I', 'Sofía Ramírez', '55555555E', 9),
('00000000J', 'Diego Vargas', '66666666F', 10);


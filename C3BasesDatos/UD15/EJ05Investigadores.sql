INSERT INTO facultad (name) VALUES
('Facultad de Ingeniería'),
('Facultad de Medicina'),
('Facultad de Biología'),
('Facultad de Informática'),
('Facultad de Física'),
('Facultad de Química'),
('Facultad de Matemáticas'),
('Facultad de Economía'),
('Facultad de Derecho'),
('Facultad de Psicología');

INSERT INTO investigado (dni, nomapellido, codf) VALUES
('12345678A', 'Ana Torres', 1),
('23456789B', 'Luis García', 2),
('34567890C', 'María Pérez', 3),
('45678901D', 'Carlos Sánchez', 4),
('56789012E', 'Lucía Gómez', 5),
('67890123F', 'Pablo Ruiz', 6),
('78901234G', 'Elena Morales', 7),
('89012345H', 'Javier López', 8),
('90123456I', 'Carmen Díaz', 9),
('01234567J', 'Andrés Ortega', 10);

INSERT INTO equipos (numserie, nombre, codf) VALUES
('A001', 'Microscopio óptico', 3),
('A002', 'Resonador magnético', 2),
('A003', 'Impresora 3D', 1),
('A004', 'Cámara infrarroja', 5),
('A005', 'Ordenador cuántico', 4),
('A006', 'Espectrómetro', 6),
('A007', 'Analizador químico', 6),
('A008', 'Robot asistente', 1),
('A009', 'Simulador económico', 8),
('A010', 'Scanner cerebral', 10);

INSERT INTO reserva (dni, numserie, startR, endR) VALUES
('12345678A', 'A003', '2025-05-01', '2025-05-10'),
('23456789B', 'A002', '2025-05-02', '2025-05-08'),
('34567890C', 'A001', '2025-05-03', '2025-05-09'),
('45678901D', 'A005', '2025-05-04', '2025-05-11'),
('56789012E', 'A004', '2025-05-05', '2025-05-12'),
('67890123F', 'A006', '2025-05-06', '2025-05-13'),
('78901234G', 'A007', '2025-05-07', '2025-05-14'),
('89012345H', 'A009', '2025-05-08', '2025-05-15'),
('90123456I', 'A010', '2025-05-09', '2025-05-16'),
('01234567J', 'A008', '2025-05-10', '2025-05-17');

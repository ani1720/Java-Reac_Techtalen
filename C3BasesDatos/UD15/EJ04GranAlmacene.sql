
                INSERT INTO producto (codepro, name, precio) VALUES
            (1, 'Cereal de avena', 3.50),
            (2, 'Leche entera 1L', 1.20),
            (3, 'Pan de molde', 2.10),
            (4, 'Jugo de naranja', 2.80),
            (5, 'Galletas integrales', 1.90),
            (6, 'Café instantáneo', 4.00),
            (7, 'Arroz blanco 1kg', 1.50),
            (8, 'Aceite vegetal 1L', 3.20),
            (9, 'Azúcar rubia 1kg', 2.30),
            (10, 'Sopa instantánea', 0.90);
            
            INSERT INTO cajeros (cod, nomapel) VALUES
            (1, 'Andrea Vargas'),
            (2, 'Luis Mendoza'),
            (3, 'Carla Romero'),
            (4, 'Jorge Pérez'),
            (5, 'Ana Martínez'),
            (6, 'Daniel Ríos'),
            (7, 'Patricia Gómez'),
            (8, 'Tomás Herrera'),
            (9, 'Lucía Torres'),
            (10, 'Santiago López');

            INSERT INTO makinreg (codemak, piso) VALUES
            (1, 1),
            (2, 1),
            (3, 2),
            (4, 2),
            (5, 3),
            (6, 3),
            (7, 4),
            (8, 4),
            (9, 5),
            (10, 5);

            INSERT INTO venta (cajero, producto, maquina) VALUES
            (1, 1, 1),
            (2, 2, 2),
            (3, 3, 3),
            (4, 4, 4),
            (5, 5, 5),
            (6, 6, 6),
            (7, 7, 7),
            (8, 8, 8),
            (9, 9, 9),
            (10, 10, 10);
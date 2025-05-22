   INSERT INTO piezas (nom) VALUES
('Tornillo métrico M4'),
('Tuerca hexagonal M4'),
('Arandela de presión'),
('Rodamiento de bolas 6202'),
('Engranaje plástico 20T'),
('Motor DC 12V'),
('Eje metálico 10cm'),
('Soporte de motor'),
('Correa dentada 100mm'),
('Placa de circuito PCB');

INSERT INTO proveedores (nombre) VALUES
('Suministros Técnicos S.A.'),
('ElectroPartes Ltda.'),
('Ferretería Central'),
('Tecnología Industrial SRL'),
('Importadora Rodar S.A.'),
('ServiComponentes'),
('ElectroMecánicos Plus'),
('Distribuidora INTEC'),
('ProveParts Group'),
('Tornillos y Más S.R.L.');

INSERT INTO suministra (codigo, idprov, precio) VALUES
(1, 1, 0.10),
(2, 2, 0.12),
(3, 3, 0.08),
(4, 4, 2.50),
(5, 5, 1.80),
(6, 6, 7.20),
(7, 7, 0.90),
(8, 8, 1.50),
(9, 9, 1.00),
(10, 10, 3.40);

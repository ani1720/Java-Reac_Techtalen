CREATE TABLE Peliculas ( id_pelicula INT PRIMARY KEY, titulo VARCHAR(100) NOT NULL, duracion INT, edad_recomendada INT );
SELECT * FROM `peliculas`
ALTER TABLE Peliculas ADD director VARCHAR(100);
CREATE DATABASE investigadores;
USE investigadores;

CREATE TABLE facultad(
    cod INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    PRIMARY KEY (cod)
    );
    
    CREATE TABLE investigado (
        dni VARCHAR(9),
        nomapellido VARCHAR(200),
        codf INT NOT NULL,
        PRIMARY KEY (dni),
     	FOREIGN KEY (codf) 
        REFERENCES facultad (cod)
        ON DELETE CASCADE
        ON UPDATE CASCADE
        );
        
        CREATE TABLE equipos(
            numserie CHAR(4),
            PRIMARY KEY (numserie),
            nombre VARCHAR(200),
            codf INT NOT NULL,
            FOREIGN KEY (codf)
            REFERENCES facultad (cod)
            ON DELETE CASCADE
            ON UPDATE CASCADE
            );

CREATE TABLE reserva(
    dni VARCHAR(9),
    numserie CHAR(4),
    startR DATE,
    endR DATE,
    PRIMARY KEY (dni, numserie),
    FOREIGN KEY (dni)
    REFERENCES investigado (dni)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (numserie)
    REFERENCES equipos (numserie)
    ON DELETE CASCADE
    ON UPDATE CASCADE
    );
/* Añadimos un AUTO_INCREMENT
ALTER TABLE `facultades` CHANGE `cod` `cod` INT(11) NOT NULL AUTO_INCREMENT;
*/
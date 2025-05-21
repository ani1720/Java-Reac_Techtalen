CREATE DATABASE granalmacen;
USE granalmacen;

CREATE TABLE producto(
    codepro INT UNSIGNED NOT NULL,
    name VARCHAR(100),
    precio FLOAT NOT NULL,
    PRIMARY KEY (codepro)
    );
    
    CREATE TABLE cajeros (
        cod INT UNSIGNED NOT NULL,
        nomapel VARCHAR(200),
        PRIMARY KEY (cod)
        );
        
        CREATE TABLE makinreg (
            codemak INT UNSIGNED NOT NULL,
            piso INT NOT NULL,
            PRIMARY KEY (codemak)
            );
            
            CREATE TABLE venta(
                cajero INT UNSIGNED NOT NULL,
                producto INT UNSIGNED NOT NULL,
                maquina INT UNSIGNED NOT NULL,
                PRIMARY KEY (cajero,producto,maquina),
                FOREIGN KEY (cajero)
                REFERENCES cajeros (cod)
                ON DELETE CASCADE
                ON UPDATE CASCADE,
                FOREIGN KEY (producto)
                REFERENCES producto (codepro)
                ON DELETE CASCADE
                ON UPDATE CASCADE,
                FOREIGN KEY (maquina)
                REFERENCES makinreg (codmak)
                ON DELETE CASCADE
                ON UPDATE CASCADE
                );
/*
 Sesión MySQL 01
*/
SHOW DATABASES;
CREATE DATABASE juguetibici;
-- Seleccionar l abase de datos
USE juguetibici;

CREATE TABLE products (
	id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(200)
 );
 -- Mostrar la estructura de la tabla
DESCRIBE products;
 -- Insertar un registro
INSERT INTO products (id, name, description) 
	VALUES (1,"Bicicleta","Bicicleta 22 pulgadas");

INSERT INTO products (id, name, description) 
	VALUES (2,"Bicicleta","Bicicleta 26 pulgadas");
INSERT INTO products (id, name, description) 
	VALUES (3,"PS5","Play Station 5");
-- No se inserta por que el name no puede ser nulo
INSERT INTO products (id, description) 
	VALUES (4,"Balón de futbol n.5");
-- Se puede insertar sin la descripción, por que puede ser null
INSERT INTO products (id, name) 
	VALUES (4,"Balón n.5");

-- Visualizar los registros de la tabla
SELECT * FROM products;

-- Borrar la base de datos.
DROP DATABASE juguetibici;


 
 
 
 






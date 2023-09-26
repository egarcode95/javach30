-- Seleccionar la DB
-- USE juguetilandia;

-- Crear una base de datos 'tienda'
CREATE DATABASE tienda;

-- Seleccionar 'tienda'
USE tienda;

-- Crear tabla 'articulos'
CREATE TABLE articulos (
	id BIGINT NOT NULL AUTO_INCREMENT KEY,
    name VARCHAR(100)
    );
    
-- Visualizar todas las tablas disponibles en 'tienda'
SHOW tables;

-- Visualizar(describir) la estructura de la tabla 'articulos'
DESCRIBE articulos;

-- Agregar un nuevo registro a la tabla 'articulos'
INSERT INTO articulos(id, name) VALUES (1, "Manzana");
INSERT INTO articulos(name) VALUES ("Pera");

-- Modificar el artículo que tiene con nombre "Manzana"
-- cambiarlo a "Manzana Verde"
UPDATE articulos 
	SET name = "Manzana verde"-- ,  description = "Super Manzana"
    WHERE name = "Manzana";

-- Eliminar el registro que id = 2
DELETE FROM articulos WHERE id = 2;

-- Mostrar todos los articulos, con todos los campos de la tabla
-- 'articulos'
SELECT * FROM articulos;

-- Mostrar solo el campo 'name' de todos los 'articulos'
-- que tengan "Manzana verde"
SELECT name FROM articulos WHERE name = "Manzana Verde";

-- Borrar una DB
DROP DATABASE tienda;
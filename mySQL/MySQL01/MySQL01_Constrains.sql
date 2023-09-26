SELECT * FROM categories;
SELECT * FROM products;

-- Obtener todos los productos de la category id = 1
SELECT * FROM products WHERE fk_category_id = 1;

-- Eliminar el id 1 hot wheels
DELETE FROM categories WHERE id = 1;

-- Modificar un ID de un registro
UPDATE categories SET id = 100 WHERE id = 33;

-- Eliminando un registo, la tabla products está en set null
DELETE FROM categories WHERE id = 10;
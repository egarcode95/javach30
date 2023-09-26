SELECT * FROM products;

-- >>>>>>>> suma y conteo de registros <<<<<<<
-- Mostrar los productos de la categoria id 2
SELECT * FROM products WHERE fk_category_id = 2;

-- Mostrar la sumatoria de la columna price
SELECT SUM( price ) AS total
	FROM products WHERE fk_category_id = 2;
    
-- Mostrar el promedio de la columna price
SELECT AVG( price ) AS total
	FROM products WHERE fk_category_id = 2;

-- Mostrar los registros que sean mayor al valor promedio de price (287.74)
SELECT * FROM products WHERE price > 287.74;

-- Consultas anidadas
SELECT * FROM products 
	WHERE price > ( SELECT AVG( price) FROM products );
    
-- Mostrar el valor mínimo del campo price
SELECT MIN(price) FROM products; -- 5.99
SELECT MAX(price) FROM products; -- 1999.00

-- Mostrar el registro o registros que tengan el valor mínimo
SELECT price, name, description
	FROM products
	WHERE price = (SELECT MIN(price) FROM products);
    
-- Contar registros
SELECT COUNT(*) FROM products;

-- Contar los registros donde 'price' sea mayor al valor promedio
SELECT COUNT(*) FROM products 
 WHERE price > (SELECT AVG(price) FROM products);
 
-- >>>>>>> Agrupar filas de acuerdo a una columna <<<<<<<
SELECT fk_category_id, SUM(price) 
	FROM products
    GROUP BY fk_category_id;
-- Mostrar el numero de productos de cada categoría, usando Group by
SELECT fk_category_id , COUNT(*) 
	from products 
    GROUP BY fk_category_id;
    
-- Mostrar el num productos de las categorias que sean menor o igual a id 2
SELECT fk_category_id , COUNT(*) 
	from products     
    GROUP BY fk_category_id
    -- condición sobre la agrupación
    HAVING fk_category_id <= 2;
    
-- Mostrar los productos que sean mayor a 100 en price
select *
	from products
    where price > 100 ORDER by fk_category_id;
 
 -- Mostrar el número de productos de cada categoría
 -- donde los productos sean mayor a 100 en price
 -- Solo muestra las categorías que sean menor o igual al id 2
 select fk_category_id, count(*) 
	FROM products 
    where price > 100
    group by fk_category_id
    having fk_category_id  <= 2;

-- uso de LIKE
-- El símbolo % representa un cero, uno o múltiples carácteres
-- El Símbolo _ representa unm carácter
SELECT * FROM products
	WHERE description LIKE "%Hot Wheels%";
    
-- Contar el número de artículos que la description tenga "Hot wheel"
SELECT COUNT(*) FROM products 
 WHERE description LIKE "%Hot Wheels%";

-- Mostrar los productos que estén en el precio de 50 a 500
-- ordenarlos de forma descendente en el precio
SELECT *
	FROM products
	WHERE price >= 50 AND price <= 500
	ORDER BY price DESC;

--  Seleccionar un rango de valores con BETWEEN
SELECT *
	FROM products
    WHERE price BETWEEN 50 AND 500
    ORDER BY price DESC;

-- Seleccionar los valores que NO estén en el rango de 50 y 500
SELECT *
	FROM products
    WHERE price NOT BETWEEN 50 AND 500
    ORDER BY price DESC;

-- Seleccionar los valores que NO estén dentro de la categoria id 1
SELECT *
	FROM products
    WHERE fk_category_id != 1;

SELECT *
	FROM products
    WHERE NOT fk_category_id = 1;

-- Eliminir filas duplicadas usando DISTINCT
SELECT DISTINCT fk_category_id FROM products;

SELECT * FROM products;
USE juguetilandia;

SELECT * FROM categories;
SELECT * FROM products;

-- Cuantos productos hay en total
SELECT COUNT(*) FROM products; -- 31

-- Cuantos productos tiene asignado una categoria
SELECT COUNT(*) FROM products WHERE fk_category_id IS NOT NULL ; -- 26 

-- Cuantos productos no tiene asignado una categoria ( son nulos)
SELECT COUNT(*) FROM products WHERE fk_category_id IS NULL ; -- 5

-- Cuantas categorias hay
SELECT COUNT(*) FROM categories; -- 6

-- Cuantas categorias están siendo usadas en la tabla productos
-- id de la categoria
SELECT DISTINCT fk_category_id AS CategoriaID
	FROM products
	WHERE fk_category_id IS NOT NULL; -- 1, 2, 3

-- Inner JOIN
SELECT * FROM products
	INNER JOIN categories
    ON products.fk_category_id = categories.id;
	
-- Visualizar id producto, nombre, price, id category, nombre categoria
SELECT products.id, products.name , products.price, 
	   categories.id AS categoryID, categories.name AS categoryName
       FROM products
       INNER JOIN categories
       ON products.fk_category_id = categories.id
       ORDER By name;


-- Visualizar id producto, nombre, price, id category, nombre categoria
-- Mostrar solamente los productos que tengan la categoria 1 y 2
SELECT products.id,products.name, products.price,
	categories.id AS categoryID, categories.name AS categoryName
	FROM products
	INNER JOIN categories
	ON products.fk_category_id=categories.id
	WHERE products.fk_category_id in( 1, 2);

-- left join
SELECT *
	FROM products -- tabla izquierda
    LEFT JOIN categories
    ON products.fk_category_id = categories.id;

-- Mostrar solo categorias 1, 2 y null
SELECT *
	FROM products -- tabla izquierda
    LEFT JOIN categories -- tabla derecha
    ON products.fk_category_id = categories.id
    WHERE products.fk_category_id in( 1, 2)  OR products.fk_category_id IS NULL;

-- Right Join
SELECT *
 FROM products -- tabla izq
 RIGHT JOIN categories -- tabla der
 ON products.fk_category_id = categories.id;


-- Mostrar todas los usuarios que en su nombre lleve "Esteban"
SELECT * FROM users
	WHERE firstname LIKE '%Esteban%';

-- Mostrar todos los artículos(incluyendo nombre del Productto) de las ordenes que ha realizado Esteban Castro
SELECT 
    users.id,
    CONCAT( firstname, ' ', lastname ) AS Fullname,
    orders.id AS idOrder,
    products.name,
    products.price,
    orders_has_products.quantity,
    orders.total_amount,
    orders.purchase_date
FROM
    users
	INNER JOIN  orders 
    ON users.id = orders.fk_user_id
    INNER JOIN orders_has_products 
    ON orders.id = orders_has_products.orders_id
	INNER JOIN products 
    ON orders_has_products.products_id = products.id
WHERE
    users.id = 2 AND orders.id = 1;
    
-- -------------------------------------------------------
SELECT 
    u.id,
    CONCAT( u.firstname, ' ', u.lastname ) AS Fullname,
    o.id AS idOrder,
    p.name,
    p.price,
    op.quantity,
    o.total_amount,
    o.purchase_date
FROM users u
INNER JOIN  orders o
    ON u.id = o.fk_user_id
INNER JOIN orders_has_products op
    ON o.id = op.orders_id
INNER JOIN products p
    ON op.products_id = p.id
WHERE
    u.id = 2;
-- ------------------------------------------ 
SELECT 
    u.id,
    CONCAT( u.firstname, ' ', u.lastname ) AS Fullname,
    o.id AS idOrder,
    p.name,
    p.price,
    op.quantity,
    o.total_amount,
    o.purchase_date
FROM users u
INNER JOIN  orders o
    ON u.id = o.fk_user_id
INNER JOIN orders_has_products op
    ON o.id = op.orders_id
INNER JOIN products p
    ON op.products_id = p.id
ORDER BY Fullname;



SELECT * FROM orders;
SELECT * FROM products;
SELECT * FROM orders_has_products;

-- Orden 1 de Esteban, con HotWheel Batman
INSERT INTO orders_has_products (orders_id, products_id, quantity)
	VALUES (1, 4, 2);
-- Orden 1 de Esteban, con HotWheel Car
INSERT INTO orders_has_products (orders_id, products_id, quantity)
	VALUES (1, 7, 3);
-- Orden 1 de Esteban, con HotWheel Moster
INSERT INTO orders_has_products (orders_id, products_id, quantity)
	VALUES (1, 16, 5);
    
-- 2 inserts(products) para order id:2 
INSERT INTO orders_has_products(orders_id,products_id,quantity)
VALUES(2,6,2), 
(2,7,2);
-- 3 inserts(products) para order id:3   
INSERT INTO orders_has_products(orders_id,products_id,quantity)
VALUES(3,5,4),
(3,6,3),
(3,7,2);
-- 2 inserts(products) para order id:4
INSERT INTO orders_has_products(orders_id,products_id,quantity)
VALUES(4,1,10),
(4,9,10);  

SELECT * FROM juguetilandia.orders;

-- Mostrar las compras realizadas en agosto
-- "2023-08-01 00:00:00" al "2023-08-31 23:59:59"
SELECT * FROM orders WHERE purchase_date 
	BETWEEN "2023-08-01 00:00:00" AND "2023-08-31 23:59:59";
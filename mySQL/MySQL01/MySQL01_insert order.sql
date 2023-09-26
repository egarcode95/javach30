USE juguetilandia;
SELECT * FROM orders;

INSERT INTO orders (fk_user_id, purchase_date, total_amount)
	VALUES (2, "2023-08-12 15:03:21", 5000.23);

INSERT INTO orders (fk_user_id, purchase_date, total_amount)
	VALUES (2, "2023-09-01 10:10:21", 9000.55);

INSERT INTO orders (fk_user_id, purchase_date, total_amount)
	VALUES (2, localtimestamp()  , 15500.55);

-- insertar 10 registros para orders
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(4, "2023-09-21 13:40:21", 1200.60);
    
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(5, localtimestamp() , 16000.55);
    
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(17, "2023-08-12 15:03:21", 5000.23);
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(19, "2023-04-11 11:11:11", 1111.11);
    
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(8, localtimestamp() , 30.55);

INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(9, "2022-08-13 15:56:45", 3000.23);
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(16, "2023-02-11 16:57:45", 600.55);
    
INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(7, localtimestamp() , 15000.55);

INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(11, "2022-07-01 20:43:01", 2220.23);

INSERT INTO orders (fk_user_id, purchase_date, total_amount)
    VALUES(13, "2023-07-31 23:43:01", 440.23);
    
    
    
    
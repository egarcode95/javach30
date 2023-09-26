-- Realizar 5 inserts para usuarios
INSERT INTO `users` (`firstname`, `lastname`, `email`, `password`, `active`) 
	VALUES ('Benjamín', 'Ortega', 'bortega@gmail.com', '123', b'1');
INSERT INTO `users` ( `firstname`, `lastname`, `email`, `password`, `active`) 
	VALUES ('Sergio', 'Torres', 'storres@gmail.com', '456', b'0');
INSERT INTO `users` ( `firstname`, `lastname`, `email`, `password`, `active`) 
	VALUES ('Leonardo', 'Rosas', 'lrosas@gmail.com', '789', b'1');
INSERT INTO `users` ( `firstname`, `lastname`, `email`, `password`, `active`) 
	VALUES ( 'Luisa', 'Eysle', 'lueyslea@gmail.com', '147', b'1');
INSERT INTO `users` ( `firstname`, `lastname`, `email`, `password`, `active`) 
	VALUES ('Georgina', 'Medina', 'gmedina@gmail.com', '258', b'1');
    
SELECT * FROM users;
-- Realizar 3 inserts para categories
INSERT INTO `categories` (`id`, `name`, `description`) 
	VALUES ('1', 'hot wheels', 'Compite todo el día con autos coleccionables de Hot Wheels, pistas llenas de acción, Hot Wheels Monster Trucks y más!');
INSERT INTO `categories` (`id`, `name`, `description`) 
	VALUES ('2', 'Todo Barbie', 'Descubre una amplia selección de muñecas y accesorios Barbie en shop.mattel.com. ¡Explora todas las muñecas Barbie, juegos, casas de muñecas y más!');
INSERT INTO `categories` (`id`, `name`, `description`) 
	VALUES ('3', 'Mattel Games', 'Conoce increíbles juegos para personas de todas las edades. Prepárate para cualquier reunión con familiares y amigos!');
SELECT * FROM  categories;
-- Realizar 5 inserts para products.
INSERT INTO `products` (`id`, `name`, `description`, `price`, `fk_category_id`) 
	VALUES ('1', 'UNO', 'UNO Juego de Cartas Flip', '109.00', '3');
INSERT INTO `products` (`id`, `name`, `description`, `price`, `fk_category_id`) 
	VALUES ('2', 'Pictionary', 'Pictionary Juego de Mesa Original', '449.00', '3');
INSERT INTO `products` (`id`, `name`, `description`, `price`, `fk_category_id`) 
	VALUES ('3', 'Scrabble', 'Scrabble Juego de Mesa Palabras Cruzadas', '479.00', '3');
INSERT INTO `products` (`id`, `name`, `description`, `price`, `fk_category_id`) 
	VALUES ('4', 'Batman', 'Hot Wheels Batman Vehículo de Juguete Escala 1:50', '299.00', '1');
INSERT INTO `products` (`id`, `name`, `description`, `price`, `fk_category_id`) 
	VALUES ('5', 'Bote Barbie', 'Barbie Set de Juego Bote de los Sueños', '1999.00', '2');
INSERT INTO `products` (`id`, `name`, `description`, `price`, `fk_category_id`) 
	VALUES ('6', 'Hot Wheels Pista', 'Hot Wheels City Pista de Juguete Ultimate Garage', '299.00', '1');

SELECT * FROM products;
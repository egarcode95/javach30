SELECT * FROM users;

INSERT INTO users(id, firstname, lastname, email, password, active)
	VALUES ( 50, "Anneth", "Tinajero", "tinajero@gmail.com", "123", 1 );

INSERT INTO users(firstname, lastname, email, password, active)
	VALUES ( "Aline", "Pool", "alineo@gmail.com", "123", 1 );

DELETE FROM users WHERE id = 50;
DELETE FROM users WHERE id = 51;
DELETE FROM users WHERE id = 52;
DELETE FROM users WHERE id = 53;

INSERT INTO users(firstname, lastname, email, password, active)
	VALUES ( "Ana", "Santoyo", "santoyo@gmail.com", "123", 1 );
    
ALTER TABLE users AUTO_INCREMENT = 1;

INSERT INTO users(firstname, lastname, email, password, active)
	VALUES ( "Yael", "Quiroz", "yael@gmail.com", "123", 1 );

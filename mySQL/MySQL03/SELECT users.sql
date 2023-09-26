USE juguetilandia;

-- ver todos los registros
SELECT * FROM users;

-- limitar el número de registros a visualizar
SELECT * FROM users LIMIT 10;

-- Ordenar por el campo email de forma descendente
SELECT * FROM users ORDER BY email DESC LIMIT 10 ;

-- Ordenar por el campo email de forma ascendente
SELECT * FROM users ORDER BY email LIMIT 10 ;

INSERT INTO users (firstname, lastname, email, password, active)
	VALUES("Mau", "Obrador", "ma@gmail.com", "123", 1);
INSERT INTO users (firstname, lastname, email, password, active)
	VALUES("Mau", "Salinas", "mas@gmail.com", "123", 1);
INSERT INTO users (firstname, lastname, email, password, active)
	VALUES("Mau", "Darth", "mad@gmail.com", "estrella", 1);
    
-- Mostra todos los campos con los registros que tengan el nombre 'Mau'    
SELECT * FROM users 
	WHERE firstname = "Mau"
    ORDER BY password ASC, lastname ASC;

--  Renombrar el nombre de la columna en la consulta
SELECT id AS "N.Serie" , firstname AS "Primer nombre"
 FROM users WHERE firstname = "Mau";

-- >>>>>>>>>>>>> Trabajar con caracteres <<<<<<<<<<<<<
-- concatenar el nombre y apellido y mostrarlos en una solo columna
SELECT 
		id AS "Participante",
		CONCAT( firstname, " ", lastname) AS "Nombre Completo",
		email
	FROM users
    WHERE firstname = "Mau"
    ORDER by `Nombre Completo`;
    
-- Mostrar todos los campos y la concatenación
SELECT 
		 * ,
		CONCAT( firstname, " ", lastname) AS "Nombre Completo"
	FROM users
    WHERE firstname = "Mau"
    ORDER by `Nombre Completo`;

-- Mostrar el nombre, apellido y la longitud del apellido
SELECT
		firstname, lastname,
        length( lastname ) AS "lengh_lastname"
	FROM users WHERE firstname = "Mau";

-- Mostrar el apelldo y apellido en reversa
SELECT lastname, REVERSE(lastname) FROM users WHERE firstname = "Mau";

-- Mostrar el apelldo y apellido en reversa en minúsculas
SELECT 
		UPPER(lastname), 
		LOWER( REVERSE(lastname) ) 
	FROM users WHERE firstname = "Mau";

SELECT * FROM users;

-- Mostrar el numero de personas que están activas e inactivas
select count(*) from users 
	 where active = 1; -- 22
select count(*) from users 
	where active = 0; -- 8

SELECT active, COUNT(*) FROM users GROUP BY active;

-- Mostrar todos los usuarios que su email sea de gmail.com
SELECT * FROM users 
  WHERE email LIKE "%gmail.com";
  
-- Mostrar todos los usuarios que su email sea de @gmail.com 
-- pero que el usuario del correo solo tenga 3 letras  ej. 123@gmail.com 
SELECT * FROM users WHERE email LIKE "___@gmail.com";

-- Mostrar los usuarios con ID 1, 4, 6, 22, operador OR
SELECT * FROM users
	WHERE id = 1 OR id = 4 OR id = 6 OR id = 22;

-- Para reducir la instrucción con múltiples Or
-- podemos usar la instrucción IN
SELECT * FROM users
	WHERE id IN (1,4,6,22);

-- Cuantos nombres(firstname) tenemos difente en la tabla users
SELECT COUNT(DISTINCT firstname) FROM users;

-- SELECT DISTINCT COUNT(firstname) FROM users; No es correcta la query

-- Mostrar los nombres que están repetidos en la tabla
SELECT firstname, COUNT(*) AS total  -- operador Alias
	FROM users
	GROUP BY firstname
	HAVING total > 1;
    
--  Conocer los IDs de las personas que tienen nombres repetidos
SELECT * FROM users
	WHERE firstname IN ("Mau", "Benjamín");
    
SELECT id, firstname, lastname FROM users
	WHERE firstname IN (
		SELECT firstname
		FROM users
		GROUP BY firstname
		HAVING COUNT(*) > 1
		);

-- Eliminar los nombres repetidos, exceptuando a
-- Mau Peniche y Benjamín Ortega
DELETE FROM users WHERE id IN (17,29,30,31);

-- Buscar los repetidos excepto con los apellidos Peniche y Ortega
SELECT id FROM users
	WHERE firstname IN 
        (
		SELECT firstname
		FROM users        
		GROUP BY firstname
		HAVING COUNT(*) > 1
		)  -- Entrega ["Mau", "Benjamín"]
        AND NOT lastname IN ("Peniche", "Ortega");

-- Eliminar los nombres repetidos, exceptuando a
-- Mau Peniche y Benjamín Ortega
/*
El error "Error Code: 1093. You can't specify target table 'users' for update in FROM clause" 
se produce cuando se intenta realizar una operación DELETE que afecta a la misma tabla (en este caso, la tabla "users")
que se usa en una subconsulta dentro de la cláusula WHERE.

Para resolver este problema, se utiliza una subconsulta derivada.
*/
DELETE FROM users WHERE id IN (
    SELECT id
    FROM (
        SELECT id FROM users
        WHERE firstname IN (
            SELECT firstname
            FROM users
            GROUP BY firstname
            HAVING COUNT(*) > 1
        )
        AND lastname NOT IN ("Peniche", "Ortega")
    ) AS subquery
);

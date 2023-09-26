
-- Crear un nuevo usuario
CREATE USER leonardo@"%" IDENTIFIED BY "123abc";

-- Crear persmisos para la DB juguetilandia al usuario leonardo
GRANT SELECT, INSERT, UPDATE, DELETE ON juguetilandia.* TO leonardo@"%";

-- Quitar privilégios de Delete
REVOKE DELETE ON juguetilandia.* FROM leonardo@"%";

-- Ver los privilégios de usuarios
SHOW GRANTS FOR leonardo@"%";
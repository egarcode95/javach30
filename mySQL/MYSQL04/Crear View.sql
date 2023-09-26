
-- Crear vistas (Views"
CREATE VIEW usersProduct AS
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

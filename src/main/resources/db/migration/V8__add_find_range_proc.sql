DELIMITER $$

CREATE PROCEDURE findProductsByRange(
    minPrice DECIMAL(10, 2),
    maxPrice DECIMAL(10, 2)
)
BEGIN
    SELECT id,name,price,cotgory_id
    FROM products
    WHERE Price BETWEEN minPrice AND maxPrice
    ORDER BY Price;

END$$
DELIMITER ;
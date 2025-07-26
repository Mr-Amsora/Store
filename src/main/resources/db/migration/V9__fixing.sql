DROP PROCEDURE IF EXISTS findProductsByRange;
DELIMITER $$
CREATE PROCEDURE findProductsByRange(
    minPrice DECIMAL(10, 2),
    maxPrice DECIMAL(10, 2)
)
BEGIN
    SELECT id, name, price, category_id
    FROM products
    WHERE price BETWEEN minPrice AND maxPrice
    ORDER BY price;
END$$
DELIMITER ;
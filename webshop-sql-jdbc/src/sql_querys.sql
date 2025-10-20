-- Tábla létrehozása:
CREATE TABLE shop_item (
    id INT NOT NULL AUTO_INCREMENT,
    item_name VARCHAR(20) NOT NULL DEFAULT 'UNKNOWN',
    item_price INT NOT NULL CHECK (item_price > 0),
    quantity INT NOT NULL CHECK (quantity >= 0),
    date_added DATE NOT NULL DEFAULT (CURDATE()),
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- Töltsük fel a táblát különböző rekordokkal az insert into parancs segítségével!
INSERT INTO shop_item (item_name, item_price, quantity)
VALUES
("Chair", 15000, 1),
("Window", 145000, 1),
("Mirror", 1500, 0);
-- Írjunk felül néhány rekordot!
UPDATE shop_item
SET item_price = 1200,
	quantity = 10
WHERE id = 7;
UPDATE shop_item
SET item_name = "Aircondition"
WHERE id = 2;
-- Összesen hány típusú termék van a webshopunkban, Számítsuk bele, ha valamiből 0 van
SELECT COUNT(shop_item.id) AS count_of_product FROM webshop.shop_item;
-- Hagyjuk figyelmen kívül, ha valamiből 0 van
SELECT COUNT(shop_item.id) AS count_of_product  FROM webshop.shop_item WHERE quantity > 0;
-- Összesen hány darab termék van a webshopunkban
SELECT SUM(shop_item.quantity) AS count_of_quantity FROM webshop.shop_item;
-- Mennyi egy átlagos termék ára?
SELECT AVG(shop_item.item_price) AS average_price_of_product FROM webshop.shop_item;
-- Mennyi egy átlagos termék ára a termékek számának súlyozásának a figyelembe vételével?
SELECT SUM(item_price * quantity) / SUM(quantity) AS average_price_for_quantity FROM webshop.shop_item;
-- Mi a legdrágább és a legolcsóbb termék neve?
WITH max_price AS (SELECT MAX(item_price) AS max_p FROM shop_item),min_price AS (SELECT MIN(item_price) AS min_p FROM shop_item) SELECT 'Most expensive' AS type, i.item_name, i.item_price FROM shop_item i JOIN max_price m ON i.item_price = m.max_p UNION ALL SELECT 'Cheapest' AS type, i.item_name, i.item_price FROM shop_item i JOIN min_price n ON i.item_price = n.min_p;
-- Mi a legrégebben és legújabban hozzáadott termék?
WITH oldest AS (SELECT MIN(date_added) AS min_date FROM shop_item),newest AS (SELECT MAX(date_added) AS max_date FROM shop_item) SELECT 'Oldest' AS type, i.item_name, i.date_added FROM shop_item i JOIN oldest o ON i.date_added = o.min_date UNION ALL SELECT 'Latest' AS type, i.item_name, i.date_added FROM shop_item i JOIN newest n ON i.date_added = n.max_date;
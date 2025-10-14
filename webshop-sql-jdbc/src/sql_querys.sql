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
SELECT item_name, item_price FROM shop_item WHERE item_price = (SELECT MAX(item_price) FROM shop_item);
SELECT item_name, item_price FROM shop_item WHERE item_price = (SELECT MIN(item_price)FROM shop_item);
-- Mi a legrégebben hozzáadott termék?
SELECT item_name, date_added FROM shop_item WHERE date_added = (SELECT MIN(date_added) FROM shop_item);
-- Mi a legújabban hozzáadott termék?
SELECT item_name, date_added FROM shop_item WHERE date_added = (SELECT MAX(date_added) FROM shop_item);
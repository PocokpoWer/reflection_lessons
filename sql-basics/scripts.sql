Basic selects:

1. SELECT * FROM world.city; 
2. SELECT name, countrycode FROM city;
3. SELECT name FROM city WHERE CountryCode = "HUN";
4. SELECT DISTINCT CountryCode FROM city;
5. SELECT DISTINCT CountryCode FROM city ORDER BY CountryCode DESC;
6. SELECT name FROM city WHERE CountryCode = "ITA";
7. SELECT name FROM city WHERE CountryCode = "AFG";
8. SELECT name, population FROM city WHERE CountryCode = "USA";
9. SELECT name, population FROM city WHERE CountryCode = "IND" ORDER BY population;
10. SELECT name, population FROM city WHERE CountryCode = "IND" ORDER BY population DESC;
11. SELECT * FROM City WHERE Name LIKE "New%";
12. SELECT name FROM city WHERE CHAR_LENGTH(name) < 7;
13. SELECT name , CHAR_LENGTH(name) AS CHAR_LENGTH FROM city WHERE CHAR_LENGTH(name) < 7 ORDER BY CHAR_LENGTH DESC;
14. SELECT name, countrycode FROM city WHERE countrycode = "HUN" AND CHAR_LENGTH(name) < 8;
15. SELECT name, population FROM city WHERE countrycode = "HUN" AND population BETWEEN 100000 AND 200000 ORDER BY population;
16. SELECT name,population FROM city WHERE countrycode IN ("HUN","ROM","ITA") ORDER BY population DESC LIMIT 1;

Aggregate functions:

1. SELECT name FROM city ORDER BY population DESC LIMIT 5;
2. SELECT name FROM city WHERE countrycode = "IND" ORDER BY population DESC LIMIT 5;
3. SELECT name FROM city WHERE countrycode = "USA" ORDER BY population DESC LIMIT 1;
4. SELECT name FROM city ORDER BY population DESC LIMIT 1;
5. SELECT District, COUNT(*) AS CityCount FROM City WHERE countrycode = "HUN" GROUP BY District ORDER BY CityCount DESC;
6. SELECT District, COUNT(*) AS CityCount FROM City WHERE countrycode = "USA" AND population > 200000 GROUP BY District;
7. SELECT CountryCode, COUNT(*) AS CityCount FROM City GROUP BY CountryCode;
8. SELECT CountryCode, COUNT(*) AS CityCount FROM City WHERE population < 150000 GROUP BY CountryCode;
9. SELECT CountryCode, COUNT(*) AS CityCount FROM City WHERE population BETWEEN 150000 AND 300000 GROUP BY CountryCode;
10. SELECT COUNT(*) AS CityCount FROM city WHERE CountryCode = "IND" ORDER BY population > 2000000;
11. SELECT AVG(population) AS avg_population FROM city;
12. SELECT AVG(population) AS avg_population FROM city WHERE countrycode = "IND";
13. SELECT AVG(population) AS avg_population FROM City WHERE countrycode = "HUN" AND name != "Budapest";
14. SELECT AVG(CHAR_LENGTH(name)) AS avg_population FROM city WHERE countrycode = "HUN";
15. SELECT AVG(CHAR_LENGTH(name)), countrycode AS avg_length FROM city GROUP BY Countrycode ORDER BY avg_length DESC;
16. SELECT countrycode, COUNT(*) AS CityCount FROM City GROUP BY countrycode ORDER BY CityCount DESC LIMIT 1;
17. SELECT CountryCode, COUNT(*) AS CityCount FROM city GROUP BY CountryCode ORDER BY CityCount LIMIT 5;
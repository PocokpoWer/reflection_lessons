CREATE TABLE szemelyek
(
    id                 INT PRIMARY KEY AUTO_INCREMENT,
    first_name         VARCHAR(50),
    last_name          VARCHAR(45),
    mother_name        VARCHAR(45),
    father_name        VARCHAR(45),
    birth_date         DATE,
    gender             ENUM('MALE', 'FEMALE'),
    highest_education  ENUM('ELEMENTARY', 'SECONDARY', 'TERTIARY'),
    number_of_children INT
);

INSERT INTO person (
    id, first_name, last_name, mother_name, father_name, birth_date, gender, highest_education, number_of_children
) VALUES
      (1, 'Jane', 'Kovács', 'Judit', 'József', '1960-01-01', 'FEMALE', 'MSC_DEGREE', 2),
      (2, 'Bence', 'Nagy', 'Katalin', 'László', '1975-11-05', 'OTHER', 'BSC_DEGREE', 8),
      (3, 'Jane', 'Horváth', 'Erika', 'Gábor', '1955-07-21', 'FEMALE', 'HIGH_SCHOOL', 0),
      (4, 'Zoltán', 'Tóth', 'Mária', 'Ferenc', '1978-02-17', 'MALE', 'VOCANTIONAL_TRAINING', 3),
      (5, 'Jane', 'Varga', 'Júlia', 'Tamás', '1912-03-30', 'FEMALE', 'PHD', 0),
      (6, 'Dániel', 'Szabó', 'Ágnes', 'János', '1995-12-09', 'MALE', 'MSC_DEGREE', 1),
      (7, 'Gergő', 'Kiss', 'Ilona', 'Péter', '1940-06-25', 'MALE', 'BSC_DEGREE', 0),
      (8, 'Jane', 'Molnár', 'Mónika', 'Miklós', '1940-10-03', 'FEMALE', 'ELEMENTARY_SCHOOL', 2),
      (9, 'Tihamér', 'Farkas', 'Éva', 'Miklós', '1960-01-01', 'MALE', 'ELEMENTARY_SCHOOL', 4),
      (10, 'Katalin', 'Balogh', 'Szilvia', 'Márton', '1988-09-28', 'FEMALE', 'HIGH_SCHOOL', 3),
      (11, 'András', 'Papp', 'Viktória', 'Péter', '1967-11-19', 'MALE', 'HIGH_SCHOOL', 5),
      (12, 'Orsolya', 'Lakatos', 'Tímea', 'Tamás', '1992-01-24', 'FEMALE', 'BSC_DEGREE', 5),
      (13, 'Péter', 'Mészáros', 'Judit', 'Zoltán', '1989-05-07', 'MALE', 'VOCANTIONAL_TRAINING', 1),
      (14, 'Júlia', 'Simon', 'Zsuzsanna', 'György', '1996-08-15', 'FEMALE', 'MSC_DEGREE', 3),
      (15, 'Susan', 'Oláh', 'Edit', 'Károly', '1984-10-29', 'FEMALE', 'PHD', 1),
      (16, 'Edit', 'Tamás', 'Anna', 'Sándor', '1970-02-10', 'FEMALE', 'MSC_DEGREE', 4),
      (17, 'Sándor', 'Fekete', 'Erzsébet', 'Ottó', '1987-11-11', 'MALE', 'HIGH_SCHOOL', 2),
      (18, 'Viktória', 'Bognár', 'Gyöngyi', 'Béla', '1993-04-23', 'FEMALE', 'ELEMENTARY_SCHOOL', 2),
      (19, 'Ádám', 'Szűcs', 'Ildikó', 'Imre', '1982-04-13', 'MALE', 'VOCANTIONAL_TRAINING', 6),
      (20, 'Mária', 'Lovas', 'Margit', 'József', '1993-06-14', 'FEMALE', 'BSC_DEGREE', 6);

UPDATE person
SET first_name = 'Tihamér',
    birth_date = '1960-01-01'
WHERE id = 9
   OR id = 1;

-- How many people there are by gender
SELECT gender, COUNT(gender) AS count_of_gender
FROM person
GROUP BY (gender);
-- How many women named Jane were born before 1980-03-02
SELECT first_name, COUNT(first_name)
FROM person
WHERE first_name = 'Jane'
  AND birth_date < '1980-03-02'
GROUP BY first_name;
-- How many women named Susan were born after 1995 and have at least an MSc degree
SELECT first_name, COUNT(first_name)
FROM person
WHERE first_name = 'Susan'
  AND birth_date > '1995-12-31'
  AND highest_education IN ('MSC_DEGREE', 'PHD')
GROUP BY first_name;
-- How many men or women born before 1960 have no children
SELECT gender, COUNT(gender)
FROM person
WHERE birth_date < '1960-01-01'
  AND number_of_children = 0
GROUP BY gender;
-- How many men or people of other genders born before 1980-05-06 have a BSc degree and at least 5 children
SELECT gender, COUNT(gender)
FROM person
WHERE birth_date < '1980-05-06'
  AND highest_education = 'BSC_DEGREE'
GROUP BY gender;
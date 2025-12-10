CREATE DATABASE IF NOT EXISTS animals
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_hungarian_ci;

USE animals;

CREATE TABLE animal (
    id INT NOT NULL AUTO_INCREMENT,
    name    VARCHAR(45) NOT NULL,
    species VARCHAR(45) NOT NULL,
    age     VARCHAR(45),
    PRIMARY KEY (id)
);

CREATE TABLE adoption (
    id INT NOT NULL AUTO_INCREMENT,
    adopter_name VARCHAR(45) NOT NULL,
    animal_id INT,
    PRIMARY KEY (id),
    CONSTRAINT fk_adoption_animal
      FOREIGN KEY (animal_id)
      REFERENCES animal(id)
      ON UPDATE CASCADE
      ON DELETE SET NULL
);
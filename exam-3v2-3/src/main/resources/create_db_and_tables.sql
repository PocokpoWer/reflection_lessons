-- Create video_rental database
CREATE DATABASE IF NOT EXISTS video_rental
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_hungarian_ci;

USE video_rental;

-- Create movie table
CREATE TABLE `video_rental`.`movie`
(
    `id`        BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `title`     VARCHAR(200) NOT NULL,
    `genre`     VARCHAR(50)  NOT NULL,
    `available` TINYINT      NOT NULL,
    PRIMARY KEY (`id`)
);

-- Create rental table
CREATE TABLE `video_rental`.`rental`
(
    `id`            BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `customer_name` VARCHAR(100) NOT NULL,
    `movie_id`      BIGINT       NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT fk_rental_movie FOREIGN KEY (movie_id) REFERENCES movie (id) ON DELETE RESTRICT ON UPDATE CASCADE
);
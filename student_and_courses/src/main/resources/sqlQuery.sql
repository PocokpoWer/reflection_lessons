CREATE DATABASE students_and_courses;
USE students_and_courses;

CREATE TABLE course
(
    id          BIGINT NOT NULL AUTO_INCREMENT,
    name        VARCHAR(255),
    description VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE student
(
    id         BIGINT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    email      VARCHAR(255),
    course_id  BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (course_id) REFERENCES course (id)
);
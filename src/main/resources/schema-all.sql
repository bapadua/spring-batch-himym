DROP TABLE himym IF EXISTS;

CREATE TABLE himym  (
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);
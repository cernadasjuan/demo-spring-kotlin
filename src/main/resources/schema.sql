DROP TABLE IF EXISTS person;

CREATE TABLE person(
    id      BIGINT PRIMARY KEY IDENTITY,
    name    VARCHAR(20) NOT NULL
);

INSERT INTO person (name) VALUES
('fran'),
('marcos'),
('leo'),
('emi'),
('juan');


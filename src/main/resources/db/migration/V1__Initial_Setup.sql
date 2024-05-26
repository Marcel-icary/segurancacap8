-- Baseline migration to create Flyway schema history table
CREATE TABLE example (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(50)
);

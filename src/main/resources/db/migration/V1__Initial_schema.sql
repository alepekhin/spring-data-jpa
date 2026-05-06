CREATE TABLE departments (
    id INT PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE users (
    id INT PRIMARY KEY,
    name TEXT NOT NULL,
    salary INT NOT NULL,
    department INT REFERENCES departments(id)
);


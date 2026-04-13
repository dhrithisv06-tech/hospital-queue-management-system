CREATE DATABASE hospita1l;

USE hospital1;

CREATE TABLE patients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    'condition' VARCHAR(100),
    priority INT
);

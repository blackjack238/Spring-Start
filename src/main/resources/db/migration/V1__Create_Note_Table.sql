CREATE TABLE note (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    content TEXT
);


-- Створення таблиці users
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL
);

-- Створення таблиці authorities
CREATE TABLE authorities (
    username VARCHAR(255) NOT NULL,
    authority VARCHAR(255) NOT NULL,
    FOREIGN KEY (username) REFERENCES users(username)
);
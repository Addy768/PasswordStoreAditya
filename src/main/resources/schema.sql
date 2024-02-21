CREATE TABLE password
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    username VARCHAR(255),
    password VARCHAR(255),
    url VARCHAR(500),
    email VARCHAR(50),
    notes VARCHAR(1000)
);
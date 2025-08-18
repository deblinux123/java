CREATE TABLE users(
    id       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL 
);

CREATE TABLE address (
    id          bigint PRIMARY KEY,
    street      VARCHAR(255) NOT NULL,
    city        VARCHAR (255) NOT NULL,
    state       VARCHAR(100) NOT NULL,
    postal_code VARCHAR(100),
    country     VARCHAR(100),

    user_id     BIGINT UNIQUE,
    CONSTRAINT fk_user_address FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
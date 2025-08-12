CREATE TABLE users
(
    id         SERIAL       PRIMARY KEY,  
    uername    VARCHAR(50)  NOT NULL,
    password   VARCHAR(100) NOT NULL,
    role       VARCHAR(20)  NOT NULL,  
    created_at TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP    DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE customer
(
    id          SERIAL       PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    email       VARCHAR(100) NOT NULL,
    phone       varchar(20)  UNIQUE,   
    created_at  TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP    DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE products
(
    id          SERIAL          PRIMARY KEY,
    name        VARCHAR(100)    NOT NULL,
    description TEXT,
    price       NUMERIC(10, 2)  NOT NULL, 
    stocked_at  TIMESTAMP       DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP       DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE orders
(
    id           SERIAL         PRIMARY key,
    order_at     TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    status       VARCHAR(20)    NOT NULL DEFAULT 'pending',
    user_id      INT            NOT NULL,
    customer_id  INT            NOT NULL,
    created_at   TIMESTAMP      DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP      DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id)       REFERENCES users(id),
    FOREIGN KEY (customer_id)   REFERENCES customer(id)
);


CREATE TABLE order_items
(
    id              SERIAL          PRIMARY KEY,
    order_id        INT             NOT NULL,
    product_id      INT             NOT NULL,
    auantity        INT             NOT NULL,
    price_per_unit  NUMERIC(10, 2)  NOT NULL,
    created_at      TIMESTAMP       DEFAULT CURRENT_TIMESTAMP,
    updated_at      TIMESTAMP       DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY     (order_id)      REFERENCES orders(id),
    FOREIGN KEY     (product_id)    REFERENCES products(id)
);
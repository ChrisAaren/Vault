DROP TABLE if exists users CASCADE;

CREATE TABLE users (
    userId int PRIMARY KEY auto_increment,
    username varchar(255) NOT NULL UNIQUE,
    password varchar(255) NOT NULL,
    phoneNumber varchar(255),
    email varchar(255)
);

-- INSERT INTO users VALUES (1, 'test1', 'test1password', '867-5309', 'thisis@test.com');
-- INSERT INTO users VALUES(2, 'test2', 'test2password', '123-456-7890', 'thisis@test2.com');
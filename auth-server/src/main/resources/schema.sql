CREATE TABLE AS_USER (
    username VARCHAR(45) NULL,
    password VARCHAR(100) NULL,
    PRIMARY KEY (username));

CREATE TABLE AS_OTP (
    username VARCHAR(45) NOT NULL,
    code VARCHAR(45) NULL,
    PRIMARY KEY (username));
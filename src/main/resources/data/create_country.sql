DROP TABLE IF EXISTS `country`;
CREATE TABLE country
(
    id   BIGINT AUTO_INCREMENT NOT NULL,
    uuid VARCHAR(255)          NULL,
    code VARCHAR(255)          NULL,
    name VARCHAR(255)          NULL,
    CONSTRAINT pk_country PRIMARY KEY (id)
);

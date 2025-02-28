DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE enterprise
(
    id                    BIGINT AUTO_INCREMENT NOT NULL,
    identification_number VARCHAR(255)          NULL,
    business_name         VARCHAR(255)          NULL,
    web                   VARCHAR(255)          NULL,
    img                   VARCHAR(255)          NULL,
    country_id            BIGINT                NULL,
    code                  VARCHAR(255)          NULL,
    name                  VARCHAR(255)          NULL,
    business_code         VARCHAR(255)          NULL,
    `description`         VARCHAR(255)          NULL,
    email                 VARCHAR(255)          NULL,
    web_link              VARCHAR(255)          NULL,
    logo                  VARCHAR(255)          NULL,
    schedule              BIT(1)                NULL,
    reason                VARCHAR(255)          NULL,
    phones                VARCHAR(255)          NULL,
    typology              VARCHAR(255)          NULL,
    CONSTRAINT pk_enterprise PRIMARY KEY (id)
);

ALTER TABLE enterprise
    ADD CONSTRAINT FK_ENTERPRISE_ON_COUNTRY FOREIGN KEY (country_id) REFERENCES country (id);
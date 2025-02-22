--
-- Table structure for table `city`
--
DROP TABLE IF EXISTS `city`;
CREATE TABLE city
(
    id              BIGINT AUTO_INCREMENT NOT NULL,
    is_active       TINYINT DEFAULT 1     NULL,
    updated_at      datetime              NULL,
    create_at       datetime              NULL,
    creator_user_id VARCHAR(255)          NULL,
    updater_user_id VARCHAR(255)          NULL,
    uuid            VARCHAR(255)          NULL,
    code            VARCHAR(255)          NULL,
    name            VARCHAR(255)          NULL,
    longitude       DECIMAL(60, 30)       NULL,
    latitude        DECIMAL(60, 30)       NULL,
    country_id      BIGINT                NULL,
    display_name    VARCHAR(255)          NULL,
    external_code   VARCHAR(255)          NULL,
    CONSTRAINT pk_city PRIMARY KEY (id)
);

ALTER TABLE city
    ADD CONSTRAINT FK_CITY_ON_COUNTRY FOREIGN KEY (country_id) REFERENCES country (id);
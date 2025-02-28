--
-- Table structure for table `establishment_v2`
--
DROP TABLE IF EXISTS `establishment_v2`;
CREATE TABLE establishment_v2
(
    id             BIGINT AUTO_INCREMENT      NOT NULL,
    enterprise_id  BIGINT                     NULL,
    city_id        BIGINT                     NULL,
    code           VARCHAR(255)               NULL,
    name           VARCHAR(255)               NULL,
    business_code  VARCHAR(255)               NULL,
    longitude      DOUBLE                     NULL,
    latitude       DOUBLE                     NULL,
    email          VARCHAR(255)               NULL,
    phone          VARCHAR(255)               NULL,
    schedule       VARCHAR(255)               NULL,
    address        VARCHAR(255)               NULL,
    has_parking    TINYINT UNSIGNED DEFAULT 0 NULL,
    pet_friendly   TINYINT UNSIGNED DEFAULT 0 NULL,
    phones         VARCHAR(255)               NULL,
    CONSTRAINT pk_establishment_v2 PRIMARY KEY (id)
);

ALTER TABLE establishment_v2
    ADD CONSTRAINT FK_ESTABLISHMENT_V2_ON_CITY FOREIGN KEY (city_id) REFERENCES city (id);

ALTER TABLE establishment_v2
    ADD CONSTRAINT FK_ESTABLISHMENT_V2_ON_ENTERPRISE FOREIGN KEY (enterprise_id) REFERENCES enterprise_v2 (id);
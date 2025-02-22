--
-- Table structure for table `enterprise_v2`
--
DROP TABLE IF EXISTS `enterprise_v2`;
CREATE TABLE enterprise_v2
(
    id                    BIGINT AUTO_INCREMENT NOT NULL,
    is_active             TINYINT DEFAULT 1     NULL,
    updated_at            datetime              NULL,
    create_at             datetime              NULL,
    creator_user_id       VARCHAR(255)          NULL,
    updater_user_id       VARCHAR(255)          NULL,
    identification_number VARCHAR(255)          NULL,
    business_name         VARCHAR(255)          NULL,
    web                   VARCHAR(255)          NULL,
    img                   VARCHAR(255)          NULL,
    country_id            BIGINT                NULL,
    code                  VARCHAR(255)          NULL,
    name                  VARCHAR(255)          NULL,
    business_code         VARCHAR(255)          NULL,
    description           VARCHAR(255)          NULL,
    email                 VARCHAR(255)          NULL,
    web_link              VARCHAR(255)          NULL,
    logo                  VARCHAR(255)          NULL,
    schedule              BIT(1)                NULL,
    reason                VARCHAR(255)          NULL,
    phones                VARCHAR(255)          NULL,
    experiencesDiners     VARCHAR(255)          NULL,
    typology              INT                   NULL,
    CONSTRAINT pk_enterprise_v2 PRIMARY KEY (id)
);

ALTER TABLE enterprise_v2
    ADD CONSTRAINT FK_ENTERPRISE_V2_ON_COUNTRY FOREIGN KEY (country_id) REFERENCES country (id);
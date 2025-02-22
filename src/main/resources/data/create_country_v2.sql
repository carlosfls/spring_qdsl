--
-- Table structure for table `country`
--
DROP TABLE IF EXISTS `country`;
CREATE TABLE country
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
    CONSTRAINT pk_country PRIMARY KEY (id)
);

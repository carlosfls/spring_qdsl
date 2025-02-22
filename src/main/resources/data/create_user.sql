DROP TABLE IF EXISTS `user`;
CREATE TABLE user
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    username VARCHAR(255)          NULL,
    password VARCHAR(255)          NULL,
    isActive BIT(1)                NULL,
    CONSTRAINT pk_tab_user PRIMARY KEY (id)
);
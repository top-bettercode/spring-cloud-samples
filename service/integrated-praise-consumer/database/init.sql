-- 点赞业务的数据库初始化
DROP DATABASE IF EXISTS integrated_praise;
CREATE DATABASE integrated_praise;
USE integrated_praise;
CREATE TABLE `item`
(
    `id`          bigint(11) unsigned NOT NULL AUTO_INCREMENT,
    `praise`      int(11)  DEFAULT NULL,
    `create_time` datetime DEFAULT NULL,
    `update_time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;
INSERT INTO `item`
VALUES ('1', '0', '2022-08-14 00:33:50', '2022-08-14 14:07:34');
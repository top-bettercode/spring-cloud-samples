-- Account账户微服务的数据库业务初始化
DROP DATABASE IF EXISTS integrated_account;
CREATE DATABASE integrated_account;
USE integrated_account;
CREATE TABLE `account`
(
    `id`          bigint(11) unsigned NOT NULL AUTO_INCREMENT,
    `user_id`     varchar(255) DEFAULT NULL,
    `money`       int(11)      DEFAULT '0',
    `create_time` datetime     DEFAULT NULL,
    `update_time` datetime     DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;
INSERT INTO `account`
VALUES ('1', 'admin', '3', '2022-08-07 22:53:01', '2022-08-14 13:49:05');


-- Storage库存微服务的数据库Seata初始化
USE integrated_account;
CREATE TABLE `undo_log`
(
    `id`            bigint(20)   NOT NULL AUTO_INCREMENT,
    `branch_id`     bigint(20)   NOT NULL,
    `xid`           varchar(100) NOT NULL,
    `context`       varchar(128) NOT NULL,
    `rollback_info` longblob     NOT NULL,
    `log_status`    int(11)      NOT NULL,
    `log_created`   datetime     NOT NULL,
    `log_modified`  datetime     NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `ux_undo_log` (`xid`, `branch_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
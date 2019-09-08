# ************************************************************
# Sequel Pro SQL dump
# Version 4500
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: haina
# Generation Time: 2019-09-08 10:45:29 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table integral
# ------------------------------------------------------------

DROP TABLE IF EXISTS `integral`;

CREATE TABLE `integral` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `integral` int(11) DEFAULT NULL,
  `money` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table invitation_code
# ------------------------------------------------------------

DROP TABLE IF EXISTS `invitation_code`;

CREATE TABLE `invitation_code` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `inviter` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `expire` int(11) DEFAULT NULL,
  `invitation_code` varchar(32) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `invitation_code` WRITE;
/*!40000 ALTER TABLE `invitation_code` DISABLE KEYS */;

INSERT INTO `invitation_code` (`id`, `inviter`, `type`, `expire`, `invitation_code`, `phone`, `user_id`, `status`, `create_time`)
VALUES
	(7,0,NULL,NULL,'WUazTOnOq','13269159510',NULL,0,'2019-09-08 05:39:14.284');

/*!40000 ALTER TABLE `invitation_code` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table task
# ------------------------------------------------------------

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `integral` int(11) DEFAULT NULL,
  `create_time` varchar(32) DEFAULT NULL,
  `start_time` varchar(32) DEFAULT NULL,
  `end_time` varchar(32) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `image` varchar(64) DEFAULT NULL,
  `desc` blob,
  `steps` varchar(300) DEFAULT NULL,
  `acceptance_conditions` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table user_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `mode` int(11) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `invitation_code` varchar(64) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `sex` varchar(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `wechat_id` varchar(32) DEFAULT NULL,
  `alipay_id` varchar(32) DEFAULT NULL,
  `create_time` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;

INSERT INTO `user_info` (`id`, `mode`, `name`, `invitation_code`, `password`, `phone`, `sex`, `age`, `wechat_id`, `alipay_id`, `create_time`)
VALUES
	(1,NULL,NULL,'WUazTOnOq','123456','13269159510',NULL,NULL,NULL,NULL,NULL);

/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user_relation
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_relation`;

CREATE TABLE `user_relation` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `leader` int(11) DEFAULT NULL,
  `inviter` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table user_task
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_task`;

CREATE TABLE `user_task` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `task_id` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `start_time` varchar(32) DEFAULT NULL,
  `result` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

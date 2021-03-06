/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - home
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`home` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `home`;

/*Table structure for table `cargo` */

DROP TABLE IF EXISTS `cargo`;

CREATE TABLE `cargo` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) NOT NULL,
  `cnumber` int(11) DEFAULT NULL,
  `callnumber` int(11) DEFAULT NULL,
  `caddtime` date DEFAULT NULL,
  `cuserid` int(11) DEFAULT NULL,
  `typeid` int(11) DEFAULT NULL,
  `uoq` varchar(100) DEFAULT NULL COMMENT '数量单位',
  PRIMARY KEY (`cid`),
  KEY `cargo_ibfk_1` (`typeid`),
  KEY `cargo_user_id` (`cuserid`),
  CONSTRAINT `cargo_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `type` (`tid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cargo_user_id` FOREIGN KEY (`cuserid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8;

/*Data for the table `cargo` */

insert  into `cargo`(`cid`,`cname`,`cnumber`,`callnumber`,`caddtime`,`cuserid`,`typeid`,`uoq`) values (1,'红布',10,20,'2020-06-24',1,4,'米'),(2,'蓝布',10,20,'2020-06-24',1,4,'米'),(3,'蓝布',10,20,'2020-06-24',1,4,'米'),(4,'蓝布',10,20,'2020-06-24',1,4,'米'),(5,'蓝布',10,20,'2020-06-24',1,4,'米'),(6,'蓝布',10,20,'2020-06-24',1,4,'米'),(7,'蓝布',10,20,'2020-06-24',1,4,'米'),(8,'蓝布',10,20,'2020-06-24',1,4,'米'),(9,'蓝布',10,20,'2020-06-24',1,4,'米'),(10,'蓝布',10,20,'2020-06-24',1,4,'米'),(11,'蓝布',10,20,'2020-06-24',1,4,'米'),(12,'蓝布',10,20,'2020-06-24',1,4,'米'),(13,'蓝布',10,20,'2020-06-24',1,4,'米'),(14,'蓝布',10,20,'2020-06-24',1,4,'米'),(15,'蓝布',10,20,'2020-06-24',1,4,'米'),(16,'蓝布',10,20,'2020-06-24',1,4,'米'),(17,'蓝布',10,20,'2020-06-24',1,4,'米'),(18,'蓝布',10,20,'2020-06-24',1,4,'米'),(19,'蓝布',10,20,'2020-06-24',1,4,'米'),(20,'蓝布',10,20,'2020-06-24',1,4,'米'),(21,'蓝布',10,20,'2020-06-24',1,4,'米'),(22,'蓝布',10,20,'2020-06-24',1,4,'米'),(23,'蓝布',10,20,'2020-06-24',1,4,'米'),(24,'蓝布',10,20,'2020-06-24',1,4,'米'),(25,'蓝布',10,20,'2020-06-24',1,4,'米'),(26,'蓝布',10,20,'2020-06-24',1,4,'米'),(27,'蓝布',10,20,'2020-06-24',1,4,'米'),(28,'蓝布',10,20,'2020-06-24',1,4,'米'),(29,'蓝布',10,20,'2020-06-24',1,4,'米'),(30,'蓝布',10,20,'2020-06-24',1,4,'米'),(31,'蓝布',10,20,'2020-06-24',1,4,'米'),(32,'蓝布',10,20,'2020-06-24',1,4,'米'),(33,'蓝布',10,20,'2020-06-24',1,4,'米'),(34,'蓝布',10,20,'2020-06-24',1,4,'米'),(35,'蓝布',10,20,'2020-06-24',1,4,'米'),(36,'蓝布',10,20,'2020-06-24',1,4,'米'),(37,'蓝布',10,20,'2020-06-24',1,4,'米'),(38,'蓝布',10,20,'2020-06-24',1,4,'米'),(39,'蓝布',10,20,'2020-06-24',1,4,'米'),(40,'蓝布',10,20,'2020-06-24',1,4,'米'),(41,'蓝布',10,20,'2020-06-24',1,4,'米'),(42,'蓝布',10,20,'2020-06-24',1,4,'米'),(43,'蓝布',10,20,'2020-06-24',1,4,'米'),(44,'蓝布',10,20,'2020-06-24',1,4,'米'),(45,'蓝布',10,20,'2020-06-24',1,4,'米'),(46,'蓝布',10,20,'2020-06-24',1,4,'米'),(47,'蓝布',10,20,'2020-06-24',1,4,'米'),(48,'蓝布',10,20,'2020-06-24',1,4,'米'),(49,'蓝布',10,20,'2020-06-24',1,4,'米'),(50,'蓝布',10,20,'2020-06-24',1,4,'米'),(51,'蓝布',10,20,'2020-06-24',1,4,'米'),(52,'蓝布',10,20,'2020-06-24',1,4,'米'),(53,'蓝布',10,20,'2020-06-24',1,4,'米'),(54,'蓝布',10,20,'2020-06-24',1,4,'米'),(55,'蓝布',10,20,'2020-06-24',1,4,'米'),(56,'蓝布',10,20,'2020-06-24',1,4,'米'),(57,'蓝布',10,20,'2020-06-24',1,4,'米'),(58,'蓝布',10,20,'2020-06-24',1,4,'米'),(59,'蓝布',10,20,'2020-06-24',1,4,'米'),(60,'蓝布',10,20,'2020-06-24',1,4,'米'),(61,'蓝布',10,20,'2020-06-24',1,4,'米'),(62,'蓝布',10,20,'2020-06-24',1,4,'米'),(63,'蓝布',10,20,'2020-06-24',1,4,'米'),(64,'蓝布',10,20,'2020-06-24',1,4,'米'),(65,'蓝布',10,20,'2020-06-24',1,4,'米'),(66,'蓝布',10,20,'2020-06-24',1,4,'米'),(67,'蓝布',10,20,'2020-06-24',1,4,'米'),(68,'蓝布',10,20,'2020-06-24',1,4,'米'),(69,'蓝布',10,20,'2020-06-24',1,4,'米'),(70,'蓝布',10,20,'2020-06-24',1,4,'米'),(71,'蓝布',10,20,'2020-06-24',1,4,'米'),(72,'蓝布',10,20,'2020-06-24',1,4,'米'),(73,'蓝布',10,20,'2020-06-24',1,4,'米'),(74,'蓝布',10,20,'2020-06-24',1,4,'米'),(75,'蓝布',10,20,'2020-06-24',1,4,'米'),(76,'蓝布',10,20,'2020-06-24',1,4,'米'),(77,'蓝布',10,20,'2020-06-24',1,4,'米'),(78,'蓝布',10,20,'2020-06-24',1,4,'米'),(79,'蓝布',10,20,'2020-06-24',1,4,'米'),(80,'蓝布',10,20,'2020-06-24',1,4,'米'),(81,'蓝布',10,20,'2020-06-24',1,4,'米'),(82,'蓝布',10,20,'2020-06-24',1,4,'米'),(83,'蓝布',10,20,'2020-06-24',1,4,'米'),(84,'蓝布',10,20,'2020-06-24',1,4,'米'),(85,'蓝布',10,20,'2020-06-24',1,4,'米'),(86,'蓝布',10,20,'2020-06-24',1,4,'米'),(87,'蓝布',10,20,'2020-06-24',1,4,'米'),(88,'蓝布',10,20,'2020-06-24',1,4,'米'),(89,'蓝布',10,20,'2020-06-24',1,4,'米'),(90,'蓝布',10,20,'2020-06-24',1,4,'米'),(91,'蓝布',10,20,'2020-06-24',1,4,'米'),(92,'蓝布',10,20,'2020-06-24',1,4,'米'),(93,'蓝布',10,20,'2020-06-24',1,4,'米'),(94,'蓝布',10,20,'2020-06-24',1,4,'米'),(95,'蓝布',10,20,'2020-06-24',1,4,'米'),(96,'蓝布',10,20,'2020-06-24',1,4,'米'),(97,'蓝布',10,20,'2020-06-24',1,4,'米'),(98,'蓝布',10,20,'2020-06-24',1,4,'米'),(99,'蓝布',10,20,'2020-06-24',1,4,'米'),(100,'蓝布',10,20,'2020-06-24',1,4,'米'),(101,'蓝布',10,20,'2020-06-24',1,4,'米'),(102,'蓝布',10,20,'2020-06-24',1,4,'米'),(103,'蓝布',10,20,'2020-06-24',1,4,'米'),(104,'蓝布',10,20,'2020-06-24',1,4,'米'),(105,'蓝布',10,20,'2020-06-24',1,4,'米'),(106,'蓝布',10,20,'2020-06-24',1,4,'米'),(107,'蓝布',10,20,'2020-06-24',1,4,'米'),(108,'蓝布',10,20,'2020-06-24',1,4,'米'),(109,'蓝布',10,20,'2020-06-24',1,4,'米'),(110,'蓝布',10,20,'2020-06-24',1,4,'米'),(111,'蓝布',10,20,'2020-06-24',1,4,'米'),(112,'蓝布',10,20,'2020-06-24',1,4,'米'),(113,'蓝布',10,20,'2020-06-24',1,4,'米'),(114,'蓝布',10,20,'2020-06-24',1,4,'米'),(115,'蓝布',10,20,'2020-06-24',1,4,'米'),(116,'蓝布',10,20,'2020-06-24',1,4,'米'),(117,'蓝布',10,20,'2020-06-24',1,4,'米'),(118,'蓝布',10,20,'2020-06-24',1,4,'米'),(119,'蓝布',10,20,'2020-06-24',1,4,'米'),(120,'蓝布',10,20,'2020-06-24',1,4,'米'),(121,'蓝布',10,20,'2020-06-24',1,4,'米'),(122,'蓝布',10,20,'2020-06-24',1,4,'米'),(123,'蓝布',10,20,'2020-06-24',1,4,'米'),(124,'大花窗帘',10,20,'2020-06-24',1,3,'批'),(125,'大红被罩',10,20,'2020-06-24',1,2,'件');

/*Table structure for table `collect` */

DROP TABLE IF EXISTS `collect`;

CREATE TABLE `collect` (
  `uid` int(11) NOT NULL DEFAULT '0',
  `jid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`uid`,`jid`),
  KEY `jid` (`jid`),
  CONSTRAINT `collect_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`id`),
  CONSTRAINT `collect_ibfk_2` FOREIGN KEY (`jid`) REFERENCES `jimg` (`jid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `collect` */

insert  into `collect`(`uid`,`jid`) values (1,1),(1,2),(1,11),(1,17);

/*Table structure for table `jimg` */

DROP TABLE IF EXISTS `jimg`;

CREATE TABLE `jimg` (
  `jid` int(11) NOT NULL AUTO_INCREMENT,
  `tid` int(11) NOT NULL,
  `src` varchar(200) DEFAULT NULL,
  `jname` varchar(100) DEFAULT NULL,
  `word` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`jid`),
  KEY `tid` (`tid`),
  CONSTRAINT `jimg_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `type` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

/*Data for the table `jimg` */

insert  into `jimg`(`jid`,`tid`,`src`,`jname`,`word`) values (1,4,'佛教布.jpg','佛教布','佛教礼仪常用布料，是带来好运与安康的选择'),(2,4,'粉布.jpg','粉布','粉色可爱系布'),(3,4,'绿布.jpg','绿布','绿色的布，环保颜色，看着舒服'),(4,4,'棉坯布.jpg','棉坯布','还没有印花的布'),(5,4,'泳装布.jpg','泳装布','做泳衣的布'),(6,4,'纤维布.jpg','纤维布','化纤的布'),(7,4,'蓝色花纹布.jpg','蓝色花纹布','适合老太太'),(8,4,'蚕丝布.jpg','蚕丝布','丝绸'),(9,1,'绿布.jpg','绿布','绿色的布，环保颜色，看着舒服'),(10,1,'棉坯布.jpg','棉坯布','还没有印花的布'),(11,1,'泳装布.jpg','泳装布','做泳衣的布'),(12,1,'纤维布.jpg','纤维布','化纤的布'),(13,1,'蓝色花纹布.jpg','蓝色花纹布','适合老太太'),(14,1,'蚕丝布.jpg','蚕丝布','丝绸'),(15,1,'佛教布.jpg','佛教布','佛教礼仪常用布料，是带来好运与安康的选择'),(16,1,'粉布.jpg','粉布','粉色可爱系布'),(17,2,'佛教布.jpg','佛教布','佛教礼仪常用布料，是带来好运与安康的选择'),(18,2,'粉布.jpg','粉布','粉色可爱系布'),(19,2,'绿布.jpg','绿布','绿色的布，环保颜色，看着舒服'),(20,2,'棉坯布.jpg','棉坯布','还没有印花的布'),(21,2,'泳装布.jpg','泳装布','做泳衣的布'),(22,2,'纤维布.jpg','纤维布','化纤的布'),(23,2,'蓝色花纹布.jpg','蓝色花纹布','适合老太太'),(24,2,'蚕丝布.jpg','蚕丝布','丝绸'),(25,3,'佛教布.jpg','佛教布','佛教礼仪常用布料，是带来好运与安康的选择'),(26,3,'粉布.jpg','粉布','粉色可爱系布'),(27,3,'绿布.jpg','绿布','绿色的布，环保颜色，看着舒服'),(28,3,'棉坯布.jpg','棉坯布','还没有印花的布'),(29,3,'泳装布.jpg','泳装布','做泳衣的布'),(30,3,'纤维布.jpg','纤维布','化纤的布'),(31,3,'蓝色花纹布.jpg','蓝色花纹布','适合老太太'),(32,3,'蚕丝布.jpg','蚕丝布','丝绸'),(33,5,'佛教布.jpg','佛教布','佛教礼仪常用布料，是带来好运与安康的选择'),(34,5,'粉布.jpg','粉布','粉色可爱系布'),(35,5,'绿布.jpg','绿布','绿色的布，环保颜色，看着舒服'),(36,5,'棉坯布.jpg','棉坯布','还没有印花的布'),(37,5,'泳装布.jpg','泳装布','做泳衣的布'),(38,5,'纤维布.jpg','纤维布','化纤的布'),(39,5,'蓝色花纹布.jpg','蓝色花纹布','适合老太太'),(40,5,'蚕丝布.jpg','蚕丝布','丝绸');

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(100) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `type` */

insert  into `type`(`tid`,`tname`) values (1,'床单'),(2,'被罩'),(3,'窗帘'),(4,'布料'),(5,'其他(枕头套等)');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(32) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`name`,`birthday`,`sex`,`phone`,`email`,`status`,`code`) values (1,'252587065','13512851948','wj','1998-10-17','男','18222137497','18222137497@163.com','Y','1'),(6,'147258369','147258369','你好','2020-10-15','男','18222137497','2193299025@qq.com','Y','a7950303d05745d58ace254417ccd943');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

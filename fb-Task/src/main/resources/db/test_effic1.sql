/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test_effic1

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-05-07 14:23:38
*/

SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `psnid` varchar(32) NOT NULL DEFAULT '',
  `psnname` varchar(32) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`psnid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('123', '111w', '1');
INSERT INTO `person` VALUES ('222', 'w222', '0');
INSERT INTO `person` VALUES ('3', '3', '1');
INSERT INTO `person` VALUES ('4', '4', '0');


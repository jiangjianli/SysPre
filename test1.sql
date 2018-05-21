/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-05-22 07:43:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_acl`;
CREATE TABLE `sys_acl` (
  `id` int(11) NOT NULL,
  `code` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `act_module_id` int(11) default NULL,
  `url` varchar(255) default NULL,
  `type` int(11) default NULL,
  `status` int(11) default NULL,
  `seq` int(255) default NULL,
  `remark` varchar(255) default NULL,
  `operator` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operate_ip` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_acl
-- ----------------------------

-- ----------------------------
-- Table structure for sys_act_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_act_module`;
CREATE TABLE `sys_act_module` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `parent_id` int(11) default NULL,
  `level` varchar(255) default NULL,
  `seq` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `operator` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operate_ip` varchar(255) default NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_act_module
-- ----------------------------

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  `parent_id` int(11) NOT NULL,
  `level` varchar(255) NOT NULL,
  `seq` int(11) NOT NULL,
  `remark` varchar(255) default NULL,
  `operator` varchar(255) NOT NULL,
  `operate_time` datetime NOT NULL,
  `operate_ip` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('0', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-20 21:11:13', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('1', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-21 21:57:07', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('2', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-20 22:23:20', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('3', 'jiang', '0', '0.1', '1', null, 'jiang', '2018-05-20 22:23:24', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('4', 'jiang', '0', '0.2', '1', null, 'jiang', '2018-05-20 22:23:28', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('5', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-20 22:23:31', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('6', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-20 22:23:34', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('7', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-20 22:23:36', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('8', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-20 22:23:39', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('9', 'jiang', '0', '0', '1', null, 'jiang', '2018-05-21 21:56:51', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('12', 'jiang', '3', '0.1.3', '1', null, 'jiang', '2018-05-21 22:43:36', '127.0.0.1');
INSERT INTO `sys_dept` VALUES ('13', 'jiang', '2', '0.2', '1', null, 'jiang', '2018-05-21 22:44:35', '127.0.0.1');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` int(11) NOT NULL,
  `type` int(11) default NULL,
  `target_id` int(11) default NULL,
  `oldvalue` varchar(255) default NULL,
  `newvalue` varchar(255) default NULL,
  `operator` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operate_ip` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `type` int(11) default NULL,
  `status` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `operator` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operate_ip` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_acl`;
CREATE TABLE `sys_role_acl` (
  `id` int(11) NOT NULL,
  `role_id` int(11) default NULL,
  `acl_id` int(11) default NULL,
  `operator` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operate_ip` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_acl
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `id` int(11) NOT NULL,
  `role_id` int(11) default NULL,
  `user_id` int(11) default NULL,
  `operator` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operate_ip` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) default NULL,
  `telephone` varchar(255) default NULL,
  `mail` varchar(255) default NULL,
  `passworld` varchar(255) default NULL,
  `dept_id` int(11) default NULL,
  `status` int(255) default NULL,
  `remark` varchar(255) default NULL,
  `operate_time` datetime default NULL,
  `operator` varchar(255) default NULL,
  `operate_ip` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------

/*
 Navicat Premium Data Transfer

 Source Server         : 47.104.77.193_8066
 Source Server Type    : MySQL
 Source Server Version : 50529
 Source Host           : 47.104.77.193:8066
 Source Schema         : shiti

 Target Server Type    : MySQL
 Target Server Version : 50529
 File Encoding         : 65001

 Date: 18/05/2020 12:20:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(64) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `login_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zhangsan', '66', '2020-05-18 12:16:32', '0:0:0:0:0:0:0:1', NULL);

SET FOREIGN_KEY_CHECKS = 1;

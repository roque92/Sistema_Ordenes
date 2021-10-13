/*
 Navicat Premium Data Transfer

 Source Server         : SistemaOrdenes
 Source Server Type    : MySQL
 Source Server Version : 100421
 Source Host           : localhost:3306
 Source Schema         : db_querico

 Target Server Type    : MySQL
 Target Server Version : 100421
 File Encoding         : 65001

 Date: 13/10/2021 17:03:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_cliente
-- ----------------------------
DROP TABLE IF EXISTS `tbl_cliente`;
CREATE TABLE `tbl_cliente`  (
  `nombre` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `telefono` int(8) NOT NULL,
  `nit` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `direccion` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `correo` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`telefono`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tbl_ordenes
-- ----------------------------
DROP TABLE IF EXISTS `tbl_ordenes`;
CREATE TABLE `tbl_ordenes`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `producto` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `precio` double(5, 2) NOT NULL,
  `telefono` int(8) NOT NULL,
  `n_orden` int(100) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

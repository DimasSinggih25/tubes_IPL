/*
Navicat MySQL Data Transfer

Source Server         : Zoey
Source Server Version : 100408
Source Host           : localhost:3306
Source Database       : tubes_rental_mobil

Target Server Type    : MYSQL
Target Server Version : 100408
File Encoding         : 65001

Date: 2022-07-02 17:13:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nik` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('26', '3411201036', 'Hira Nur Afifah', 'Pojok', '89555');
INSERT INTO `customer` VALUES ('27', '3411201039', 'Dimas Singgih', 'Cikande', '89666');
INSERT INTO `customer` VALUES ('28', '3411201050', 'Afuza Dwi Purnam', 'Cimareme', '89777');

-- ----------------------------
-- Table structure for daftar_mobil
-- ----------------------------
DROP TABLE IF EXISTS `daftar_mobil`;
CREATE TABLE `daftar_mobil` (
  `no_regis` varchar(11) NOT NULL,
  `nomor_polisi` varchar(11) NOT NULL,
  `Merk` varchar(255) NOT NULL,
  `Model` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL,
  `harga` int(11) DEFAULT NULL,
  PRIMARY KEY (`no_regis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of daftar_mobil
-- ----------------------------
INSERT INTO `daftar_mobil` VALUES ('A0001', 'D 2002 SQ', 'Toyota', 'Fortuner', 'Tersedia', '400000');
INSERT INTO `daftar_mobil` VALUES ('A0002', 'D 2023 LK', 'Suzuki', 'APV', 'Tidak Tersedia', '350000');
INSERT INTO `daftar_mobil` VALUES ('A0003', 'D 2711 XQ', 'Honda', 'Mobilio', 'Tersedia', '350000');
INSERT INTO `daftar_mobil` VALUES ('A0004', 'D 7622 PQ', 'Toyota', 'Avanza', 'Tidak Tersedia', '300000');
INSERT INTO `daftar_mobil` VALUES ('A0005', 'D 777 TY', 'Suzuki', 'Ertiga', 'Tersedia', '300000');
INSERT INTO `daftar_mobil` VALUES ('A0006', 'D 778 DY', 'Honda', 'Brio', 'Tersedia', '400000');
INSERT INTO `daftar_mobil` VALUES ('A0007', 'D 666 HH', 'Suzuki', 'Kijang', 'Tersedia', '350000');
INSERT INTO `daftar_mobil` VALUES ('A0008', 'D 222 FF', 'Toyotat', 'Calya', 'Tersedia', '20000');
INSERT INTO `daftar_mobil` VALUES ('A0009', 'D 444 DD', 'Toyota', 'Calya', 'Tersedia', '200');

-- ----------------------------
-- Table structure for pengembalian_mobil
-- ----------------------------
DROP TABLE IF EXISTS `pengembalian_mobil`;
CREATE TABLE `pengembalian_mobil` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomor_polisi` varchar(255) NOT NULL,
  `nik` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL DEFAULT '',
  `return_date` varchar(255) NOT NULL,
  `elp` int(11) NOT NULL,
  `fine` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pengembalian_mobil
-- ----------------------------
INSERT INTO `pengembalian_mobil` VALUES ('18', 'D 2002 SQ', '3411201050', 'Afuza Dwi Purnam', '2022/06/24', '8', '1600000');

-- ----------------------------
-- Table structure for rental
-- ----------------------------
DROP TABLE IF EXISTS `rental`;
CREATE TABLE `rental` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomor_polisi` varchar(255) NOT NULL,
  `merk` varchar(255) NOT NULL DEFAULT '',
  `model` varchar(255) NOT NULL DEFAULT '',
  `nik` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL DEFAULT '',
  `date` varchar(255) NOT NULL,
  `due` varchar(255) NOT NULL,
  `hari` int(11) NOT NULL,
  `biaya` int(11) NOT NULL,
  `total` int(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of rental
-- ----------------------------
INSERT INTO `rental` VALUES ('43', 'D 2023 LK', 'Suzuki', 'APV', '3411201036', 'Hira Nur Afifah', '2022/07/03', '2022/07/05', '2', '350000', '700000');
INSERT INTO `rental` VALUES ('44', 'D 7622 PQ', 'Toyota', 'Avanza', '3411201039', 'Dimas Singgih', '2022/07/01', '2022/07/02', '1', '300000', '300000');

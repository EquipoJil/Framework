-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.31-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para demo
DROP DATABASE IF EXISTS `demo`;
CREATE DATABASE IF NOT EXISTS `demo` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `demo`;


-- Volcando estructura para tabla demo.electronicos
DROP TABLE IF EXISTS `electronicos`;
CREATE TABLE IF NOT EXISTS `electronicos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla demo.papelerias
DROP TABLE IF EXISTS `papelerias`;
CREATE TABLE IF NOT EXISTS `papelerias` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `precio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla demo.personas
DROP TABLE IF EXISTS `personas`;
CREATE TABLE IF NOT EXISTS `personas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `ciudad` varchar(100) DEFAULT NULL,
  `curp` varchar(100) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla demo.productos
DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `precio` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para procedimiento demo.spproductosearch
DROP PROCEDURE IF EXISTS `spproductosearch`;
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `spproductosearch`(IN arg varchar(30))
BEGIN 
    SELECT p.* FROM productos p where p.nombre like concat("%",arg,"%") or descripcion like concat("%",arg,"%");
END//
DELIMITER ;


-- Volcando estructura para tabla demo.telefonos
DROP TABLE IF EXISTS `telefonos`;
CREATE TABLE IF NOT EXISTS `telefonos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(50) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `precio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

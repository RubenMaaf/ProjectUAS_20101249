/*
SQLyog Community
MySQL - 10.4.14-MariaDB : Database - db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `ds` */

CREATE TABLE `ds` (
  `NIDN` int(10) NOT NULL,
  `NAMA` varchar(50) DEFAULT NULL,
  `JK` varchar(50) DEFAULT NULL,
  `GELAR` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`NIDN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `ds` */

insert  into `ds`(`NIDN`,`NAMA`,`JK`,`GELAR`) values (2345,'suryawan adi','P','s3');

/*Table structure for table `mhs` */

CREATE TABLE `mhs` (
  `NIM` int(8) NOT NULL,
  `NAMA` varchar(50) DEFAULT NULL,
  `JURUSAN` varchar(50) DEFAULT NULL,
  `TGL_LAHIR` varchar(20) DEFAULT NULL,
  `JK` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`NIM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `mhs` */

/*Table structure for table `mk` */

CREATE TABLE `mk` (
  `KODE` int(10) NOT NULL,
  `NAMA` varchar(50) DEFAULT NULL,
  `JURUSAN` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`KODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `mk` */

insert  into `mk`(`KODE`,`NAMA`,`JURUSAN`) values (5345,'gfgg hh ss','KAB');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sqa
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bomon`
--

DROP TABLE IF EXISTS `bomon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bomon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `Khoaid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKBoMon655498` (`Khoaid`),
  CONSTRAINT `FKBoMon655498` FOREIGN KEY (`Khoaid`) REFERENCES `khoa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bomon`
--

LOCK TABLES `bomon` WRITE;
/*!40000 ALTER TABLE `bomon` DISABLE KEYS */;
INSERT INTO `bomon` VALUES (1,'CNTT','cntt',1),(2,'KHMT','khmt',1),(3,'KTMT','ktmt',1),(4,'ATTT','attt',2);
/*!40000 ALTER TABLE `bomon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangkihoc`
--

DROP TABLE IF EXISTS `dangkihoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dangkihoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ghichu` varchar(255) DEFAULT NULL,
  `SinhVienKhoaid` int NOT NULL,
  `LopHocPhanid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKDangKiHoc816078` (`SinhVienKhoaid`),
  KEY `FKDangKiHoc638697` (`LopHocPhanid`),
  CONSTRAINT `FKDangKiHoc638697` FOREIGN KEY (`LopHocPhanid`) REFERENCES `lophocphan` (`id`),
  CONSTRAINT `FKDangKiHoc816078` FOREIGN KEY (`SinhVienKhoaid`) REFERENCES `sinhvienkhoa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=988 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangkihoc`
--

LOCK TABLES `dangkihoc` WRITE;
/*!40000 ALTER TABLE `dangkihoc` DISABLE KEYS */;
INSERT INTO `dangkihoc` VALUES (207,NULL,3,5),(208,NULL,3,2),(209,NULL,3,3),(210,NULL,3,7),(211,NULL,3,10),(212,NULL,3,11),(236,NULL,2,6),(269,NULL,4,2),(270,NULL,4,4),(271,NULL,4,6),(272,NULL,4,8);
/*!40000 ALTER TABLE `dangkihoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diachi`
--

DROP TABLE IF EXISTS `diachi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diachi` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sonha` varchar(255) NOT NULL,
  `toanha` varchar(255) DEFAULT NULL,
  `xompho` varchar(255) NOT NULL,
  `phuongxa` varchar(255) NOT NULL,
  `quanhuyen` varchar(255) NOT NULL,
  `tinhthanh` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diachi`
--

LOCK TABLES `diachi` WRITE;
/*!40000 ALTER TABLE `diachi` DISABLE KEYS */;
INSERT INTO `diachi` VALUES (1,'00','00','Thạc Quả','Dục Tú','Đông Anh','Hà Nội'),(2,'00','00','Nguyen Van Troi','Mo lao','Ha Dong','Ha Noi'),(3,'00','00','Nguyen Van Troi','Mo lao','Ha Dong','Ha Noi'),(4,'00','00','Nguyen Van Troi','Mo lao','Ha Dong','Ha Noi');
/*!40000 ALTER TABLE `diachi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giangvien`
--

DROP TABLE IF EXISTS `giangvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giangvien` (
  `ThanhVienid` int NOT NULL,
  `BoMonid` int NOT NULL,
  UNIQUE KEY `ThanhVienid_UNIQUE` (`ThanhVienid`),
  KEY `FKGiangVien813889` (`BoMonid`),
  KEY `FKGiangVien97344_idx` (`ThanhVienid`),
  CONSTRAINT `FKGiangVien813889` FOREIGN KEY (`BoMonid`) REFERENCES `bomon` (`id`),
  CONSTRAINT `FKGiangVien97344` FOREIGN KEY (`ThanhVienid`) REFERENCES `thanhvien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giangvien`
--

LOCK TABLES `giangvien` WRITE;
/*!40000 ALTER TABLE `giangvien` DISABLE KEYS */;
INSERT INTO `giangvien` VALUES (5,1),(6,1),(7,1),(8,1),(9,1),(10,1),(11,1);
/*!40000 ALTER TABLE `giangvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocki`
--

DROP TABLE IF EXISTS `hocki`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocki` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocki`
--

LOCK TABLES `hocki` WRITE;
/*!40000 ALTER TABLE `hocki` DISABLE KEYS */;
INSERT INTO `hocki` VALUES (1,'Học kì 1','no'),(2,'Học kì 2','no'),(3,'Học kì 3','no');
/*!40000 ALTER TABLE `hocki` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoa`
--

DROP TABLE IF EXISTS `khoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khoa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `Truongid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKKhoa985266` (`Truongid`),
  CONSTRAINT `FKKhoa985266` FOREIGN KEY (`Truongid`) REFERENCES `truong` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoa`
--

LOCK TABLES `khoa` WRITE;
/*!40000 ALTER TABLE `khoa` DISABLE KEYS */;
INSERT INTO `khoa` VALUES (1,'CNTT','cong nghe thong tin',1),(2,'ATTT','an toan thong tin',1),(3,'MKT','Marketing',1);
/*!40000 ALTER TABLE `khoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kihoc`
--

DROP TABLE IF EXISTS `kihoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kihoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `danghoc` int NOT NULL,
  `dangdk` int NOT NULL,
  `HocKiid` int NOT NULL,
  `NamHocid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKKiHoc283769` (`NamHocid`),
  CONSTRAINT `FKKiHoc283769` FOREIGN KEY (`NamHocid`) REFERENCES `namhoc` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kihoc`
--

LOCK TABLES `kihoc` WRITE;
/*!40000 ALTER TABLE `kihoc` DISABLE KEYS */;
INSERT INTO `kihoc` VALUES (1,1,0,1,1),(2,0,1,2,1);
/*!40000 ALTER TABLE `kihoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kip`
--

DROP TABLE IF EXISTS `kip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kip` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kip`
--

LOCK TABLES `kip` WRITE;
/*!40000 ALTER TABLE `kip` DISABLE KEYS */;
INSERT INTO `kip` VALUES (1,'Kip 1','7h->9h'),(2,'Kip 2','9h->11h'),(3,'Kip 3','12h->14h'),(4,'Kip 4','14h->16h'),(5,'Kip 5','16h->18h'),(6,'Kip 6','18h->20h');
/*!40000 ALTER TABLE `kip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lichhoc`
--

DROP TABLE IF EXISTS `lichhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lichhoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `PhongHocid` int NOT NULL,
  `Kipid` int NOT NULL,
  `Ngayid` int NOT NULL,
  `Tuanid` int NOT NULL,
  `GiangVienThanhVienid` int NOT NULL,
  `LopHocPhanid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKLichHoc435933` (`PhongHocid`),
  KEY `FKLichHoc47268` (`Kipid`),
  KEY `FKLichHoc869007` (`Ngayid`),
  KEY `FKLichHoc16995` (`Tuanid`),
  KEY `FKLichHoc313476` (`GiangVienThanhVienid`),
  KEY `FKLichHoc657451` (`LopHocPhanid`),
  CONSTRAINT `FKLichHoc16995` FOREIGN KEY (`Tuanid`) REFERENCES `tuan` (`id`),
  CONSTRAINT `FKLichHoc313476` FOREIGN KEY (`GiangVienThanhVienid`) REFERENCES `giangvien` (`ThanhVienid`),
  CONSTRAINT `FKLichHoc435933` FOREIGN KEY (`PhongHocid`) REFERENCES `phonghoc` (`id`),
  CONSTRAINT `FKLichHoc47268` FOREIGN KEY (`Kipid`) REFERENCES `kip` (`id`),
  CONSTRAINT `FKLichHoc657451` FOREIGN KEY (`LopHocPhanid`) REFERENCES `lophocphan` (`id`),
  CONSTRAINT `FKLichHoc869007` FOREIGN KEY (`Ngayid`) REFERENCES `ngay` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lichhoc`
--

LOCK TABLES `lichhoc` WRITE;
/*!40000 ALTER TABLE `lichhoc` DISABLE KEYS */;
INSERT INTO `lichhoc` VALUES (1,'Lich hoc 1','no',1,1,1,1,5,1),(2,'Lich hoc 2','no',1,1,1,2,5,1),(3,'Lich hoc 3','no',1,1,1,3,5,1),(4,'Lich hoc 4','no',1,1,1,4,5,1),(5,'Lich hoc 5','no',1,1,1,5,5,1),(6,'Lich hoc 6','no',1,1,1,6,5,1),(7,'Lich hoc 7','no',2,2,2,1,6,2),(8,'Lich hoc 8','no',2,2,2,2,6,2),(9,'Lich hoc 9','no',2,2,2,3,6,2),(10,'Lich hoc 10','no',2,2,2,4,6,2),(11,'Lich hoc 11','no',2,2,2,5,6,2),(12,'Lich hoc 12','no',2,2,2,6,6,2),(13,'Lich hoc 13','no',1,3,1,1,7,3),(14,'Lich hoc 14','no',1,3,1,2,7,3),(15,'Lich hoc 15','no',1,3,1,3,7,3),(16,'Lich hoc 16','no',1,3,1,4,7,3),(17,'Lich hoc 17','no',1,3,1,5,7,3),(18,'Lich hoc 18','no',1,3,1,6,7,3),(19,'Lich hoc 19','no',3,1,3,1,8,4),(20,'Lich hoc 20','no',3,1,3,2,8,4),(21,'Lich hoc 21','no',3,1,3,3,8,4),(22,'Lich hoc 22','no',3,1,3,4,8,4),(23,'Lich hoc 23','no',3,1,3,5,8,4),(24,'Lich hoc 24','no',3,1,3,6,8,4),(44,'Lich hoc 25','no',4,3,3,1,9,5),(45,'Lich hoc 26','no',4,3,3,2,9,5),(46,'Lich hoc 27','no',4,3,3,3,9,5),(47,'Lich hoc 28','no',4,3,3,4,9,5),(48,'Lich hoc 29','no',4,3,3,5,9,5),(49,'Lich hoc 30','no',4,3,3,6,9,5),(50,'Lich hoc 31','no',5,4,2,1,10,6),(51,'Lich hoc 32','no',5,4,2,2,10,6),(52,'Lich hoc 33','no',5,4,2,3,10,6),(53,'Lich hoc 34','no',5,4,2,4,10,6),(54,'Lich hoc 35','no',5,4,2,5,10,6),(55,'Lich hoc 36','no',5,4,2,6,10,6),(56,'Lich hoc 37','no',3,3,1,1,5,7),(57,'Lich hoc 38','no',3,3,1,2,5,7),(58,'Lich hoc 39','no',3,3,1,3,5,7),(59,'Lich hoc 40','no',3,3,1,4,5,8),(60,'Lich hoc 41','no',3,3,1,5,5,8),(61,'Lich hoc 42','no',3,3,1,6,5,8),(65,'Lich hoc 46','no',5,2,5,4,6,10),(68,'Lich hoc 49','no',4,1,6,1,7,11),(69,'Lich hoc 50','no',4,1,6,2,7,12),(70,'Lich hoc 51','no',4,2,5,4,6,13);
/*!40000 ALTER TABLE `lichhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lophocphan`
--

DROP TABLE IF EXISTS `lophocphan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lophocphan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `sisotoida` int NOT NULL,
  `sisothucte` int NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `MonHocKiHocid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKLopHocPhan891132` (`MonHocKiHocid`),
  CONSTRAINT `FKLopHocPhan891132` FOREIGN KEY (`MonHocKiHocid`) REFERENCES `monhockihoc` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lophocphan`
--

LOCK TABLES `lophocphan` WRITE;
/*!40000 ALTER TABLE `lophocphan` DISABLE KEYS */;
INSERT INTO `lophocphan` VALUES (1,'Lớp học phần 1',60,30,'no',1),(2,'Lớp học phần 2',60,4,'no',1),(3,'Lớp học phần 3',60,5,'no',2),(4,'Lớp học phần 4',60,1,'no',2),(5,'Lớp học phần 5',60,5,'no',3),(6,'Lớp học phần 6',60,2,'no',3),(7,'Lớp học phần 7',60,6,'no',4),(8,'Lớp học phần 8',60,0,'no',4),(10,'Lớp học phần 10',60,3,'no',5),(11,'Lớp học phần 11',60,3,'no',6),(12,'Lớp học phần 12',60,0,'no',6),(13,'Lớp học phần 13',60,0,'no',6),(14,'Lớp học phần 14',60,0,'no',6);
/*!40000 ALTER TABLE `lophocphan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `sotc` int NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `BoMonid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKMonHoc258682` (`BoMonid`),
  CONSTRAINT `FKMonHoc258682` FOREIGN KEY (`BoMonid`) REFERENCES `bomon` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc`
--

LOCK TABLES `monhoc` WRITE;
/*!40000 ALTER TABLE `monhoc` DISABLE KEYS */;
INSERT INTO `monhoc` VALUES (1,'Đảm bảo chất lượng phần mềm',3,'no',1),(2,'Thiết kế hệ thống thông tin',3,'no',1),(3,'Lập trình Java',4,'no',2),(4,'Thiết kế phần mềm hướng dịch vụ',3,'no',1),(5,'Lập trình thiết bị di động',3,'no',1),(6,'Thiết kế hệ thống nhúng',3,'no',1),(7,'An toàn thông tin',3,'no',4);
/*!40000 ALTER TABLE `monhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhockihoc`
--

DROP TABLE IF EXISTS `monhockihoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhockihoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `MonHocid` int NOT NULL,
  `KiHocid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKMonHocKiHo706379` (`MonHocid`),
  KEY `FKMonHocKiHo474327` (`KiHocid`),
  CONSTRAINT `FKMonHocKiHo474327` FOREIGN KEY (`KiHocid`) REFERENCES `kihoc` (`id`),
  CONSTRAINT `FKMonHocKiHo706379` FOREIGN KEY (`MonHocid`) REFERENCES `monhoc` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhockihoc`
--

LOCK TABLES `monhockihoc` WRITE;
/*!40000 ALTER TABLE `monhockihoc` DISABLE KEYS */;
INSERT INTO `monhockihoc` VALUES (1,1,2),(2,2,2),(3,3,2),(4,4,2),(5,5,2),(6,6,2),(7,7,2);
/*!40000 ALTER TABLE `monhockihoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoctienquyet`
--

DROP TABLE IF EXISTS `monhoctienquyet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoctienquyet` (
  `MonHocid` int NOT NULL,
  `MonHocTienQuyetid` int NOT NULL,
  KEY `FKMonHocTien840099` (`MonHocid`),
  KEY `FKMonHocTien645237` (`MonHocTienQuyetid`),
  CONSTRAINT `FKMonHocTien645237` FOREIGN KEY (`MonHocTienQuyetid`) REFERENCES `monhoc` (`id`),
  CONSTRAINT `FKMonHocTien840099` FOREIGN KEY (`MonHocid`) REFERENCES `monhoc` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoctienquyet`
--

LOCK TABLES `monhoctienquyet` WRITE;
/*!40000 ALTER TABLE `monhoctienquyet` DISABLE KEYS */;
/*!40000 ALTER TABLE `monhoctienquyet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `namhoc`
--

DROP TABLE IF EXISTS `namhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `namhoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `namhoc`
--

LOCK TABLES `namhoc` WRITE;
/*!40000 ALTER TABLE `namhoc` DISABLE KEYS */;
INSERT INTO `namhoc` VALUES (1,'2024','2024');
/*!40000 ALTER TABLE `namhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngay`
--

DROP TABLE IF EXISTS `ngay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ngay` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngay`
--

LOCK TABLES `ngay` WRITE;
/*!40000 ALTER TABLE `ngay` DISABLE KEYS */;
INSERT INTO `ngay` VALUES (1,'Thứ 2','no'),(2,'Thứ 3','no'),(3,'Thứ 4','no'),(4,'Thứ 5','no'),(5,'Thứ 6','no'),(6,'Thứ 7','no'),(7,'Chủ nhật','no');
/*!40000 ALTER TABLE `ngay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `vitri` varchar(255) DEFAULT NULL,
  `ThanhVienid` int NOT NULL,
  PRIMARY KEY (`ThanhVienid`),
  CONSTRAINT `FKNhanVien255298` FOREIGN KEY (`ThanhVienid`) REFERENCES `thanhvien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phonghoc`
--

DROP TABLE IF EXISTS `phonghoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phonghoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `succhua` int NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `ToaNhaid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKPhongHoc965871` (`ToaNhaid`),
  CONSTRAINT `FKPhongHoc965871` FOREIGN KEY (`ToaNhaid`) REFERENCES `toanha` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phonghoc`
--

LOCK TABLES `phonghoc` WRITE;
/*!40000 ALTER TABLE `phonghoc` DISABLE KEYS */;
INSERT INTO `phonghoc` VALUES (1,'301',50,'Phong 301',1),(2,'302',50,'Phong 302',1),(3,'303',50,'Phong 303',1),(4,'304',50,'Phong 304',1),(5,'305',50,'Phong 305',1),(6,'306',50,'Phong 306',1);
/*!40000 ALTER TABLE `phonghoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `masv` varchar(255) NOT NULL,
  `ThanhVienid` int NOT NULL,
  PRIMARY KEY (`ThanhVienid`),
  CONSTRAINT `FKSinhVien456313` FOREIGN KEY (`ThanhVienid`) REFERENCES `thanhvien` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES ('B20DCCN570',1),('B20DCCN001',2),('B20DCCN002',3),('B20DCCN003',4),('B20DCCN007',12);
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvienkhoa`
--

DROP TABLE IF EXISTS `sinhvienkhoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvienkhoa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nienkhoa` varchar(255) NOT NULL,
  `danghoc` int NOT NULL,
  `SinhVienid` int DEFAULT NULL,
  `Khoaid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKSinhVienKh65841` (`SinhVienid`),
  KEY `FKSinhVienKh803325` (`Khoaid`),
  CONSTRAINT `FKSinhVienKh65841` FOREIGN KEY (`SinhVienid`) REFERENCES `sinhvien` (`ThanhVienid`),
  CONSTRAINT `FKSinhVienKh803325` FOREIGN KEY (`Khoaid`) REFERENCES `khoa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvienkhoa`
--

LOCK TABLES `sinhvienkhoa` WRITE;
/*!40000 ALTER TABLE `sinhvienkhoa` DISABLE KEYS */;
INSERT INTO `sinhvienkhoa` VALUES (1,'2020',1,1,1),(2,'2020',1,2,1),(3,'2020',1,3,1),(4,'2020',1,4,1),(5,'2020',1,12,2),(6,'2021',1,12,3);
/*!40000 ALTER TABLE `sinhvienkhoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thanhvien`
--

DROP TABLE IF EXISTS `thanhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thanhvien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `hodem` varchar(255) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `ngaysinh` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `dt` varchar(255) NOT NULL,
  `ghichu` varchar(255) NOT NULL,
  `vaitro` varchar(255) NOT NULL,
  `DiaChiid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKThanhVien235359` (`DiaChiid`),
  CONSTRAINT `FKThanhVien235359` FOREIGN KEY (`DiaChiid`) REFERENCES `diachi` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thanhvien`
--

LOCK TABLES `thanhvien` WRITE;
/*!40000 ALTER TABLE `thanhvien` DISABLE KEYS */;
INSERT INTO `thanhvien` VALUES (1,'Student','123','Trần Văn','Sông','2002-06-27','songtran02@gmail.com','0000101010','note','Sinh viên',1),(2,'Student','1234','Trần Văn','A','2024-04-01','admin@gmail.com','0000101010','note','Sinh Viên',2),(3,'Student','12345','Trần Văn','B','2024-04-01','admin@gmail.com','0000101010','note','Sinh Viên',3),(4,'Student','123456','Trần Văn','C','2024-04-01','Ctran@gmail.com','0000101010','note','Sinh Viên',4),(5,'Teacher','123','Nguyen Van','Son','1990-04-01','dtran@gmail.com','0001231312','note','Giang Vien',1),(6,'Teacher','1234','Nguyen Van','Ngoc','1989-04-01','etran@gmail.com','0000123123','note','Giang Vien',3),(7,'GiangVien','123','Nguyen Thi','Bich Ngoc','2002-04-01','ngoc@gmail.com','0001231233','note','Giang Vien',4),(8,'GiangVien','1234','Nguyen Manh','Hung','1999-04-01','hung@gmail.com','0000123132','note ','Giang Vien',3),(9,'GiangVien','12345','Dang Ngoc','Hung','1999-04-01','hung01@gmail.com','0000123312','note','Giang Vien',4),(10,'GiangVien','123456','Nguyen Thi','Van Anh','1999-04-01','va@gmail.com','0000123213','note','Giang Vien',3),(11,'GiangVien','111','Vu Hoai','Nam','0199-04-01','nam@gmail.com','0000012313','note','Giang Vien',4),(12,'Student','1234567','AA','A','2002-01-01','a@gmail.com','0124345215','note','Sinh Viên',1);
/*!40000 ALTER TABLE `thanhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toanha`
--

DROP TABLE IF EXISTS `toanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `toanha` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `Truongid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKToaNha994101` (`Truongid`),
  CONSTRAINT `FKToaNha994101` FOREIGN KEY (`Truongid`) REFERENCES `truong` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toanha`
--

LOCK TABLES `toanha` WRITE;
/*!40000 ALTER TABLE `toanha` DISABLE KEYS */;
INSERT INTO `toanha` VALUES (1,'A2','A2',1);
/*!40000 ALTER TABLE `toanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truong`
--

DROP TABLE IF EXISTS `truong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `truong` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `DiaChiid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKTruong201905` (`DiaChiid`),
  CONSTRAINT `FKTruong201905` FOREIGN KEY (`DiaChiid`) REFERENCES `diachi` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truong`
--

LOCK TABLES `truong` WRITE;
/*!40000 ALTER TABLE `truong` DISABLE KEYS */;
INSERT INTO `truong` VALUES (1,'PTIT','Hoc vien cong nghe buu chinh vien thong',1);
/*!40000 ALTER TABLE `truong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuan`
--

DROP TABLE IF EXISTS `tuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuan`
--

LOCK TABLES `tuan` WRITE;
/*!40000 ALTER TABLE `tuan` DISABLE KEYS */;
INSERT INTO `tuan` VALUES (1,'Tuần 13','từ 1->7'),(2,'Tuần 14','từ 8->15'),(3,'Tuần 15','từ 16->23'),(4,'Tuần 16','từ 24->31'),(5,'Tuần 17','từ 32->39'),(6,'Tuần 18','từ 40->47');
/*!40000 ALTER TABLE `tuan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-12 18:49:05

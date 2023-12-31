-- MariaDB dump 10.19  Distrib 10.5.23-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: PBO_Praktikum
-- ------------------------------------------------------
-- Server version	10.5.23-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `data_user`
--

DROP TABLE IF EXISTS `data_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_user`
--

LOCK TABLES `data_user` WRITE;
/*!40000 ALTER TABLE `data_user` DISABLE KEYS */;
INSERT INTO `data_user` VALUES (1,'khalifardy','Ayu20021993','khalifardy miqdarsah','khalifardy.miqdarsah@gmail.com'),(2,'awink22','qwerty12345','awink','');
/*!40000 ALTER TABLE `data_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log_hitung`
--

DROP TABLE IF EXISTS `log_hitung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log_hitung` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dimensi` varchar(100) NOT NULL,
  `jenis_bangun` varchar(100) NOT NULL,
  `jenis_hitungan` varchar(100) NOT NULL,
  `hasil` double NOT NULL,
  `waktu` datetime NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `log_hitung_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `data_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_hitung`
--

LOCK TABLES `log_hitung` WRITE;
/*!40000 ALTER TABLE `log_hitung` DISABLE KEYS */;
INSERT INTO `log_hitung` VALUES (1,'2D','Persegi','Luas',4,'2023-12-30 00:00:00',1),(2,'3D','Tabung','Luas Permukaan',603.1857894892403,'2023-12-31 06:54:58',1),(3,'3D','Tabung','Volume',1130.9733552923256,'2023-12-31 06:55:07',1),(4,'3D','Tabung','Luas Permukaan',3216.990877275948,'2023-12-31 07:17:31',1),(5,'3D','Balok','Volume',66,'2023-12-31 07:23:17',1),(6,'3D','Balok','Volume',88,'2023-12-31 07:24:02',1),(7,'3D','Balok','Volume',80,'2023-12-31 07:26:42',1),(8,'3D','Balok','Luas Permukaan',112,'2023-12-31 07:26:43',1),(9,'3D','Kubus','Volume',150,'2023-12-31 07:31:05',1),(10,'3D','Kubus','Volume',343,'2023-12-31 07:32:21',1),(11,'3D','Prisma','Luas Permukaan',49,'2023-12-31 07:42:07',1),(12,'3D','Prisma','Volume',30,'2023-12-31 07:43:41',1),(13,'2D','Persegi','Keliling',20,'2023-12-31 07:45:56',2),(14,'2D','Persegi','Luas',9,'2023-12-31 07:47:22',2),(15,'2D','Persegi','Keliling',12,'2023-12-31 07:47:24',2),(16,'2D','Segitiga','Keliling',10,'2023-12-31 07:54:13',2),(17,'2D','Segitiga','Luas',3,'2023-12-31 07:54:15',2),(18,'2D','Persegi Panjang','Keliling',14,'2023-12-31 07:58:05',2),(19,'2D','Persegi Panjang','LUas',12,'2023-12-31 07:58:12',2),(20,'2D','Lingkaran','Keliling',25.132741228718345,'2023-12-31 08:02:30',2),(21,'2D','Lingkaran','Luas',50.26548245743669,'2023-12-31 08:02:32',2);
/*!40000 ALTER TABLE `log_hitung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabel_mahasiswa`
--

DROP TABLE IF EXISTS `tabel_mahasiswa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabel_mahasiswa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(100) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `prodi` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabel_mahasiswa`
--

LOCK TABLES `tabel_mahasiswa` WRITE;
/*!40000 ALTER TABLE `tabel_mahasiswa` DISABLE KEYS */;
INSERT INTO `tabel_mahasiswa` VALUES (1,'miko','1304211035','IF'),(2,'ayu','1234567','SE'),(3,'ali','23526428','IF'),(5,'syna','12024124912','IT');
/*!40000 ALTER TABLE `tabel_mahasiswa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabel_produk`
--

DROP TABLE IF EXISTS `tabel_produk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabel_produk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabel_produk`
--

LOCK TABLES `tabel_produk` WRITE;
/*!40000 ALTER TABLE `tabel_produk` DISABLE KEYS */;
INSERT INTO `tabel_produk` VALUES (1,'Buku',1000,1),(2,'Laptop',10000,2),(3,'komputer',100000,50),(4,'produk11',3000,2),(5,'produk7',2,1),(7,'produk8',0,0),(8,'produk9',1,1),(9,'produk8',0,0),(11,'produk2',1000,10),(12,'produk3',2000,20),(13,'produk4',5000,40),(14,'produk5',20000,7),(15,'produk10',1,1);
/*!40000 ALTER TABLE `tabel_produk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'PBO_Praktikum'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-31  8:13:40

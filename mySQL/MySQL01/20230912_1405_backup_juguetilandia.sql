-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: juguetilandia
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'hot wheels','Compite todo el día con autos coleccionables de Hot Wheels, pistas llenas de acción, Hot Wheels Monster Trucks y más!'),(2,'Todo Barbie','Descubre una amplia selección de muñecas y accesorios Barbie en shop.mattel.com. ¡Explora todas las muñecas Barbie, juegos, casas de muñecas y más!'),(3,'Mattel Games','Conoce increíbles juegos para personas de todas las edades. Prepárate para cualquier reunión con familiares y amigos!');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fk_user_id` bigint NOT NULL,
  `purchase_date` timestamp NULL DEFAULT NULL,
  `total_amount` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`id`,`fk_user_id`),
  KEY `order_has_user_idx` (`fk_user_id`),
  CONSTRAINT `order_has_user` FOREIGN KEY (`fk_user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders_has_products`
--

DROP TABLE IF EXISTS `orders_has_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders_has_products` (
  `orders_id` bigint NOT NULL,
  `products_id` bigint NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`orders_id`,`products_id`),
  KEY `fk_orders_has_products_products1_idx` (`products_id`),
  KEY `fk_orders_has_products_orders1_idx` (`orders_id`),
  CONSTRAINT `ordersProducts_has_orders` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `ordersProducts_has_products` FOREIGN KEY (`products_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders_has_products`
--

LOCK TABLES `orders_has_products` WRITE;
/*!40000 ALTER TABLE `orders_has_products` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders_has_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `price` decimal(8,2) DEFAULT NULL,
  `fk_category_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_has_category_idx` (`fk_category_id`),
  CONSTRAINT `product_has_category` FOREIGN KEY (`fk_category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'UNO','UNO Juego de Cartas Flip',109.00,3),(2,'Pictionary','Pictionary Juego de Mesa Original',449.00,3),(3,'Scrabble','Scrabble Juego de Mesa Palabras Cruzadas',479.00,3),(4,'Batman','Hot Wheels Batman Vehículo de Juguete Escala 1:50',299.00,1),(5,'Bote Barbie','Barbie Set de Juego Bote de los Sueños',1999.00,2),(6,'Hot Wheels Pista','Hot Wheels City Pista de Juguete Ultimate Garage',299.00,1),(7,'Hot Wheels Car','Classic Hot Wheels car with fast wheels.',5.99,1),(8,'Barbie Doll','A beautiful Barbie doll with stylish outfits.',19.99,2),(9,'Uno Card Game','The classic Uno card game for family fun.',8.49,3),(10,'Monster Truck','Bigfoot monster truck for off-road adventures.',24.99,1),(11,'Barbie Dreamhouse','Barbie Dreamhouse with multiple rooms and accessories.',99.99,2),(12,'Pictionary Board Game','Pictionary board game for drawing and guessing.',12.99,3),(13,'Hot Wheels Track Set','Exciting Hot Wheels track set for racing.',14.99,1),(14,'Barbie Fashionista','Barbie Fashionista doll with trendy fashion.',17.99,2),(15,'UNO Attack Game','UNO Attack game with a rapid-fire card launcher.',29.99,3),(16,'Hot Wheels Monster Truck','Hot Wheels Monster Truck with oversized wheels.',9.99,1),(17,'Barbie Convertible','Barbie convertible car for stylish adventures.',15.99,2),(18,'Scrabble Board Game','Classic Scrabble board game for word enthusiasts.',16.99,3),(19,'Hot Wheels Garage','Hot Wheels garage playset for car enthusiasts.',32.99,1),(20,'Barbie Ken Doll','Ken doll from Barbie with various outfits.',18.99,2),(21,'Apples to Apples Game','Fun Apples to Apples game for parties.',10.99,3),(22,'Hot Wheels Ultimate Track','Ultimate Hot Wheels track for epic races.',39.99,1),(23,'Barbie Dream Camper','Barbie Dream Camper for outdoor adventures.',79.99,2),(24,'Chess Board Game','Classic chess board game for strategy lovers.',21.99,3),(25,'Hot Wheels Mega Loop','Mega loop Hot Wheels track for stunts.',29.99,1),(26,'Barbie Dream Horse','Interactive Barbie Dream Horse with sounds.',49.99,2);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Mau','Peniche','mau@gmail.com','123',_binary ''),(2,'Esteban','Castro','esteban@gmail.com','123',_binary '\0'),(4,'Benjamín','Ortega','bortega@gmail.com','123',_binary ''),(5,'Sergio','Torres','storres@gmail.com','456',_binary '\0'),(6,'Leonardo','Rosas','lrosas@gmail.com','789',_binary ''),(7,'Luisa','Eysle','lueyslea@gmail.com','147',_binary ''),(8,'Georgina','Medina','gmedina@gmail.com','258',_binary ''),(9,'John','Doe','johndoe@example.com','password1',_binary ''),(10,'Jane','Smith','janesmith@example.com','password2',_binary ''),(11,'Michael','Johnson','michaeljohnson@example.com','password3',_binary ''),(12,'Emily','Brown','emilybrown@example.com','password4',_binary '\0'),(13,'William','Lee','williamlee@example.com','password5',_binary ''),(14,'Olivia','Davis','oliviadavis@example.com','password6',_binary ''),(15,'James','Wilson','jameswilson@example.com','password7',_binary '\0'),(16,'Sophia','Anderson','sophiaanderson@example.com','password8',_binary ''),(17,'Benjamin','Miller','benjaminmiller@example.com','password9',_binary ''),(18,'Emma','Taylor','emmataylor@example.com','password10',_binary '\0'),(19,'Ethan','Moore','ethanmoore@example.com','password11',_binary ''),(20,'Ava','Johnson','avajohnson@example.com','password12',_binary ''),(21,'Mason','Harris','masonharris@example.com','password13',_binary '\0'),(22,'Isabella','Clark','isabellaclark@example.com','password14',_binary ''),(23,'Noah','Young','noahyoung@example.com','password15',_binary ''),(24,'Oliver','King','oliverking@example.com','password16',_binary '\0'),(25,'Amelia','Wright','ameliawright@example.com','password17',_binary ''),(26,'Lucas','Lewis','lucaslewis@example.com','password18',_binary ''),(27,'Mia','Hall','miahall@example.com','password19',_binary '\0'),(28,'Liam','Brown','liambrown@example.com','password20',_binary '');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-12 14:05:55

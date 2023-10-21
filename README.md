# JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project

* Java (JDK 8 or 11) Recommended JDK 11
* Jersey MVC
* Hibernate
* MySQL

# Maven Dependencies

    <dependencies>

        <!--Tomcat Server-->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-core</artifactId>
            <version>10.1.7</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-logging-juli</artifactId>
            <version>9.0.0.M6</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <version>10.1.7</version>
            <scope>compile</scope>
        </dependency>

        <!--Jakarta Servlet-->
        <dependency>
            <groupId>jakarta.servlet</groupId>
            <artifactId>jakarta.servlet-api</artifactId>
            <version>6.0.0</version>
            <scope>provided</scope>
        </dependency>

        <!--Jersey-->
        <dependency>
            <groupId>org.glassfish.jersey.core</groupId>
            <artifactId>jersey-common</artifactId>
            <version>3.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.glassfish.jersey.containers</groupId>
            <artifactId>jersey-container-servlet</artifactId>
            <version>3.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.glassfish.jersey.inject</groupId>
            <artifactId>jersey-hk2</artifactId>
            <version>3.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.glassfish.jersey.ext</groupId>
            <artifactId>jersey-mvc-jsp</artifactId>
            <version>3.1.2</version>
        </dependency>

        <dependency>
            <groupId>org.glassfish.jersey.media</groupId>
            <artifactId>jersey-media-json-jackson</artifactId>
            <version>3.1.2</version>
        </dependency>

        <!--Fusionauth-->
        <dependency>
            <groupId>io.fusionauth</groupId>
            <artifactId>fusionauth-jwt</artifactId>
            <version>5.2.4</version>
        </dependency>

        <!--Hibernate & MySQL-->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.1.7.Final</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>8.0.1.Final</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
        </dependency>

        <!--Jakarta JSTL-->
        <dependency>
            <groupId>org.glassfish.web</groupId>
            <artifactId>jakarta.servlet.jsp.jstl</artifactId>
            <version>2.0.0-M1</version>
        </dependency>

        <!--JSP Template Inheritance-->
        <dependency>
            <groupId>lk.callidora.jsp</groupId>
            <artifactId>jsp-template-inheritance</artifactId>
            <version>1.0.1</version>
        </dependency>

    </dependencies>

    <repositories>
        <repository>
            <id>gitlab-maven</id>
            <url>https://gitlab.com/api/v4/projects/48539154/packages/maven</url>
        </repository>
    </repositories>

    <distributionManagement>
        <repository>
            <id>gitlab-maven</id>
            <url>https://gitlab.com/api/v4/projects/48539154/packages/maven</url>
        </repository>

        <snapshotRepository>
            <id>gitlab-maven</id>
            <url>https://gitlab.com/api/v4/projects/48539154/packages/maven</url>
        </snapshotRepository>
    </distributionManagement>

# User Interfaces

![image](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/85c54c1a-d217-43d2-9ba7-a16f90e3533a)
![image](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/6042be06-01cf-49bb-a13d-b67c6cdb885a)
![image](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/f6882e7b-9157-4bb5-a6f1-ce6bd724362f)
![image](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/91c65dc5-ca1c-4091-a521-4addf221b8f5)
![image](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/d5b2d662-93d6-4fe5-9bed-a93b748c1cbd)

# Database Backup (MySQL)
```
-----------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for crud_op_web_db
CREATE DATABASE IF NOT EXISTS `crud_op_web_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `crud_op_web_db`;

-- Dumping structure for table crud_op_web_db.product
CREATE TABLE IF NOT EXISTS `product` (
  `Id` bigint NOT NULL AUTO_INCREMENT,
  `price` double NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table crud_op_web_db.product: ~2 rows (approximately)
INSERT INTO `product` (`Id`, `price`, `title`) VALUES
	(3, 55000, 'Apple iPhone 5s'),
	(5, 54000, 'Samsung Galaxy A12'),
	(7, 55000, 'Apple iPhone 7 Plus'),
	(8, 72000, 'Samsung A12');

-- Dumping structure for table crud_op_web_db.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(20) DEFAULT NULL,
  `username` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table crud_op_web_db.user: ~4 rows (approximately)
INSERT INTO `user` (`id`, `password`, `username`) VALUES
	(1, '1234', 'sanjaya'),
	(4, '1234', 'ishan'),
	(5, '1234', 'asanka');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

```


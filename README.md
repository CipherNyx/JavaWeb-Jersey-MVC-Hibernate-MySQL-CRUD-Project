# 🚀 JavaWeb Jersey MVC Hibernate MySQL CRUD Project

A full‑stack **Java web application** demonstrating **CRUD operations** with **Jersey MVC**, **Hibernate ORM**, **MySQL**, and **JSP**.  
This project is designed for **learning, portfolios, and enterprise‑style development**.

---

## ✨ Features
- 🔑 **User Authentication** (Login/Register)
- 📦 **Product Management** – Create, Read, Update, Delete
- 🧩 **MVC Architecture** with Jersey
- 🗃️ **Hibernate ORM** with MySQL integration
- 🎨 **JSP Views** with JSTL & Template Inheritance
- 🧪 **Embedded Tomcat** for easy deployment

---

## 🖼️ User Interfaces

### 🔘 Login, Register & Products Buttons
![Login/Register](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/85c54c1a-d217-43d2-9ba7-a16f90e3533a)

### 🔑 Login Page
![Login Page](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/6042be06-01cf-49bb-a13d-b67c6cdb885a)

### 🏠 Home Page
![Home Page](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/f6882e7b-9157-4bb5-a6f1-ce6bd724362f)

### 📦 Products & ➕ Add Product Page
![Products/Add Product](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/91c65dc5-ca1c-4091-a521-4addf221b8f5)

### ✏️ Update Product Page
![Update Product](https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project/assets/90567387/d5b2d662-93d6-4fe5-9bed-a93b748c1cbd)

---

## 🛠️ Tech Stack
<p align="left">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=flat&logo=java" />
  <img src="https://img.shields.io/badge/Framework-Jersey_MVC-blue?style=flat" />
  <img src="https://img.shields.io/badge/ORM-Hibernate-green?style=flat" />
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=flat&logo=mysql" />
  <img src="https://img.shields.io/badge/View-JSP_JSTL-yellow?style=flat" />
  <img src="https://img.shields.io/badge/Server-Tomcat-red?style=flat&logo=apachetomcat" />
</p>

---

## ⚙️ Getting Started

### 1️⃣ Clone the repository
	git clone https://github.com/CipherNyx/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project.git

### Key dependencies (pom.xml)

	<!-- Servlet API (provided by container) -->
	<dependency>
	  <groupId>jakarta.servlet</groupId>
	  <artifactId>jakarta.servlet-api</artifactId>
	  <version>6.0.0</version>
	  <scope>provided</scope>
	</dependency>
	
	<!-- Jersey -->
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
	
	<!-- Hibernate & Validator -->
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
	
	<!-- MySQL Connector -->
	<dependency>
	  <groupId>mysql</groupId>
	  <artifactId>mysql-connector-java</artifactId>
	  <version>8.0.28</version>
	</dependency>
	
	<!-- JSP & JSTL -->
	<dependency>
	  <groupId>org.glassfish.web</groupId>
	  <artifactId>jakarta.servlet.jsp.jstl</artifactId>
	  <version>2.0.0-M1</version>
	</dependency>
	
	<!-- JSP Template Inheritance -->
	<dependency>
	  <groupId>lk.callidora.jsp</groupId>
	  <artifactId>jsp-template-inheritance</artifactId>
	  <version>1.0.1</version>
	</dependency>
	
	<!-- Embedded Tomcat (for local run) -->
	<dependency>
	  <groupId>org.apache.tomcat.embed</groupId>
	  <artifactId>tomcat-embed-core</artifactId>
	  <version>10.1.7</version>
	</dependency>
	<dependency>
	  <groupId>org.apache.tomcat.embed</groupId>
	  <artifactId>tomcat-embed-jasper</artifactId>
	  <version>10.1.7</version>
	</dependency>
	
	<!-- FusionAuth JWT (optional auth) -->
	<dependency>
	  <groupId>io.fusionauth</groupId>
	  <artifactId>fusionauth-jwt</artifactId>
	  <version>5.2.4</version>
	</dependency>

---

### 2️⃣ Configure Database

- Create a MySQL database:

		CREATE DATABASE crud_op_web_db;

- Import the provided SQL script (/db/backup.sql) or use the sample below:
  
		CREATE TABLE product (
		  Id BIGINT PRIMARY KEY AUTO_INCREMENT,
		  price DOUBLE NOT NULL,
		  title VARCHAR(255)
		);
		
		CREATE TABLE user (
		  id BIGINT PRIMARY KEY AUTO_INCREMENT,
		  username VARCHAR(60),
		  password VARCHAR(20)
		);

---

### 🗄️ Sample Database (MySQL)

	CREATE DATABASE crud_op_web_db;
	
	CREATE TABLE product (
	  Id BIGINT PRIMARY KEY AUTO_INCREMENT,
	  price DOUBLE NOT NULL,
	  title VARCHAR(255)
	);
	
	INSERT INTO product (price, title) VALUES
	  (55000, 'Apple iPhone 5s'),
	  (54000, 'Samsung Galaxy A12'),
	  (55000, 'Apple iPhone 7 Plus'),
	  (72000, 'Samsung A12');
	
	CREATE TABLE user (
	  id BIGINT PRIMARY KEY AUTO_INCREMENT,
	  username VARCHAR(60),
	  password VARCHAR(20)
	);
	
	INSERT INTO user (username, password) VALUES
	  ('sanjaya', '1234'),
	  ('ishan', '1234'),
	  ('asanka', '1234');

---

### 3️⃣ Update Hibernate Config

Edit hibernate.cfg.xml with your MySQL credentials:

	<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/crud_op_web_db</property>
	<property name="hibernate.connection.username">root</property>
	<property name="hibernate.connection.password">your_password</property>

---

### 4️⃣ Build & Run

- Import into IntelliJ/NetBeans.
- Run with embedded Tomcat or deploy the WAR to an external server.
- Access the app at:
  
	  http://localhost:8080/JavaWeb-Jersey-MVC-Hibernate-MySQL-CRUD-Project

---

## 🎮 How It Work

- Login/Register → Authenticate users
- Home Page → Navigate to product management
- Add Product → Insert new product into DB
- Update Product → Modify existing product details
- Delete Product → Remove product from DB

---

## 🚀 Future Plan

- Add role‑based access control (admin/user)
- Implement REST API endpoints for external integration
- Enhance UI with Bootstrap/modern styling
- Add unit tests for services and controllers
- Dockerize the project for easier deployment

---

## 🤝 Contributing

Contributions are welcome!
- Fork the repo
- Create a new branch (feature/your-feature)
- Commit your changes
- Push the branch and open a Pull Request

---

## 📄 License
This project is licensed under the MIT License.
Feel free to fork, extend, and contribute!

---

## 📫 Contact
👨‍💻 **Author:** Sanjaya Suraweera (CipherNyx)  
🐙 **GitHub:** [CipherNyx](https://github.com/CipherNyx)  
📧 **Email:** sasbsuraweera@gmail.com  
💼 **LinkedIn:** [sanjaya-suraweera](https://www.linkedin.com/in/sanjaya-suraweera/)  
📺 **YouTube:** [SanjayaSuraweera](https://www.youtube.com/@SanjayaSuraweera)  
📷 **Instagram:** [sanjaya_suraweera](https://www.instagram.com/sanjaya_suraweera/)  
🎵 **TikTok:** [nits_mind](https://www.tiktok.com/@nits_mind)  
📘 **Facebook:** [sanjaya.bandara.suraweera](https://www.facebook.com/sanjaya.bandara.suraweera/)

---

⭐ If you like this project, don’t forget to **star the repo** and share your feedback!

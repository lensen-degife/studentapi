---

# 📚 Student API (Spring Boot)

A simple RESTful API for managing student records built using **Spring Boot**. This project demonstrates CRUD operations with a layered architecture using Spring Boot, Spring Data JPA, and an in-memory database (or any configured DB).

---

## 🚀 Features

* Create a new student
* Retrieve all students
* Retrieve student by ID
* Update student details
* Delete student
* Create a new course
* Retrieve all courses
* Retrieve course by ID
* Update course details
* Delete course
* RESTful architecture
* Clean layered structure (Controller, Service, Repository)

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* H2 Database 
* Maven

---

## 📁 Project Structure

```
studentapi/
│── src/main/java/com/example/studentapi
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   └── StudentApiApplication.java
│
│── src/main/resources
│   ├── application.properties
│
└── pom.xml
```

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/studentapi.git
cd studentapi
```

### 2. Configure the database

For H2 (default):

```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:studentdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
```

For MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

### 3. Build and run the application

```bash
mvn clean install
mvn spring-boot:run
```

---

## 📡 API Endpoints

### ➕ Create Student

```
POST /api/students
```

### 📄 Get All Students

```
GET /api/students
```

### 🔍 Get Student by ID

```
GET /api/students/{id}
```

### ✏️ Update Student

```
PUT /api/students/{id}
```

### ❌ Delete Student

```
DELETE /api/students/{id}
```

---

## 🧾 Sample JSON Request

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "age": 21
}
```

---

## 🧪 Testing Tools

You can test the API using:
* Insomnia(I used this)
* Postman
* cURL
* Swagger (if added)

---

## 📌 Future Improvements

* Add Swagger UI documentation
* Add validation (Jakarta Validation)
* Add exception handling
* Add authentication (Spring Security + JWT)
* Pagination and sorting

---

## 👨‍💻 Author

Lensen Degife
GitHub: [https://github.com/lensen-degife](https://github.com/lensen-degife)

---

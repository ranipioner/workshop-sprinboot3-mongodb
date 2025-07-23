# Spring Boot 3 + MongoDB Workshop

This project is a hands-on workshop built with **Spring Boot 3**, **Java 21**, and **MongoDB**. It demonstrates how to build a RESTful API using modern Java and Spring technologies with a document-based NoSQL database. The system manages users and posts, with support for comments, DTOs, and robust error handling.
This project was made through Nelio Alves's Udemy Course "Java COMPLETO Programação Orientada a Objetos + Projetos" @acenelio (Github)


## ✅ Features

- Full CRUD operations on Users and Posts
- Embedded documents (comments, authors)
- DTO pattern to decouple domain and transport layers
- Spring Data MongoDB for persistence
- Centralized exception handling
- Automatic DB seeding on startup
- REST API with clean architecture

---

## 🧰 Tech Stack

- Java 21 (compatible with Java 17+)
- Spring Boot 3.x
- Spring Web
- Spring Data MongoDB
- MongoDB
- Maven

---

## 📁 Project Structure 

```
project-root/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.ranieri.workshopmongo/
│ │ │ ├── WorkshopmongoApplication.java # Spring Boot entry point
│ │ │ ├── config/Instantiation.java # Seeds database with initial data
│ │ │ ├── domain/ # Domain models
│ │ │ │ ├── Post.java
│ │ │ │ └── User.java
│ │ │ ├── dto/ # Data Transfer Objects
│ │ │ │ ├── AuthorDTO.java
│ │ │ │ ├── CommentDTO.java
│ │ │ │ └── UserDTO.java
│ │ │ ├── repository/ # Spring Data MongoDB repositories
│ │ │ │ ├── PostRepository.java
│ │ │ │ └── UserRepository.java
│ │ │ ├── resources/ # REST controllers
│ │ │ │ ├── PostResource.java
│ │ │ │ └── UserResource.java
│ │ │ ├── resources.exception/ # Global exception handling
│ │ │ │ ├── ResourceExceptionHandler.java
│ │ │ │ └── StandardError.java
│ │ │ ├── resources.util/ # Utility helpers
│ │ │ │ └── URL.java
│ │ │ ├── services/ # Service layer
│ │ │ │ ├── PostService.java
│ │ │ │ └── UserService.java
│ │ │ └── services.exception/
│ │ │ └── ObjectNotFoundException.java
│ │ └── resources/
│ │ ├── application.properties # Spring Boot config
│ │ ├── static/ # Static web files 
│ │ └── templates/ # Templates 
│
│ └── test/
│ └── java/com.ranieri.workshopmongo/
│ └── WorkshopmongoApplicationTests.java # Basic integration test
│
├── pom.xml # Maven config
├── mvnw / mvnw.cmd # Maven wrapper
├── HELP.md # Spring initial help (optional)
└── README.md # You're reading it!
```

## 🖥️  How to Run

### Prerequisites

- Java 21 (or Java 17+)
- MongoDB running locally (`localhost:27017`)
- Maven installed or use the included Maven wrapper

### Steps

1. Clone the project:
   ```
   git clone https://github.com/your-username/workshop-springboot3-mongodb.git
   cd workshop-springboot3-mongodb
   ```
2. Run MongoDB:
```
mongod
``` 
3. Start the application:
```
./mvnw spring-boot:run
```
4. Access the API:
```
http://localhost:8080/

```
5.(Optional) H2 Console, Swagger UI, or custom endpoints can be added depending on further configs.

🧪 Testing
The project includes a basic Spring Boot test class to ensure the context loads.

To run tests:

```
./mvnw test
```

🎯 Learning Objectives
Model relationships in MongoDB using embedded documents

Use DTOs to abstract domain logic from transport layer

Handle exceptions with clean, structured JSON responses

Organize a Spring Boot project using layered architecture

Seed your database programmatically

📄 License
This project is intended for educational purposes only. You are free to fork, clone, and use it to study or as the base of your own experiments.



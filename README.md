# 📔 Journal App – Spring Boot REST API

A backend application built using **Java and Spring Boot** that allows users to create, manage, and securely access their personal journal entries.

This project was developed as a hands-on learning project while following a Spring Boot tutorial series. During development, I worked with REST API development, database integration, authentication, and backend application architecture.

## 🚀 Features

- **User Management:** Create and manage user accounts.
- **Journal Management:** Create, retrieve, update, and delete journal entries.
- **MongoDB Integration:** Store user information and journal entries using MongoDB.
- **Spring Security:** Secure application endpoints and manage authentication.
- **Password Encryption:** Use BCrypt password encoding to protect user passwords.
- **User Authorization:** Apply role-based access control.
- **RESTful APIs:** Implement backend endpoints using Spring Boot and Spring MVC.
- **API Documentation:** Include OpenAPI/Swagger dependencies for API documentation.
- **Additional Integrations:** Explore technologies such as Kafka, Redis, JWT, OAuth2, and email services.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Spring Boot | Backend application framework |
| Spring MVC | REST API development |
| Spring Security | Authentication and authorization |
| Spring Data MongoDB | Database integration |
| MongoDB | NoSQL database |
| Maven | Dependency management and build automation |
| Lombok | Reduce boilerplate code |
| JWT | Token-based authentication support |
| Apache Kafka | Messaging integration |
| Redis | Caching integration |
| Swagger / OpenAPI | API documentation |

*Some technologies are included as dependencies for additional integration and learning; their implementation may vary across project versions.*

## 🏗️ Project Architecture

The application follows a layered architecture to separate responsibilities and make the code easier to maintain.

```text
src/main/java
    └── com.example.journalApp
          │
          ├── config
          │     └── Security Configuration
          │
          ├── controller
          │     └── REST API Endpoints
          │
          ├── entity
          │     ├── User
          │     └── JournalEntry
          │
          ├── repository
          │     └── MongoDB Data Access
          │
          ├── service
          │     └── Business Logic
          │
          └── JournalAppApplication.java
```

## ⚙️ Getting Started

Follow these instructions to run the project locally.

### Prerequisites

Make sure you have installed:

- Java Development Kit (JDK) 17
- Maven
- MongoDB (local installation or MongoDB Atlas)
- IntelliJ IDEA or another Java IDE
- Postman (for API testing)

### 1. Clone the Repository

```bash
git clone https://github.com/SumanMalik22/journalApp.git
```

### 2. Navigate to the Project Directory

```bash
cd journalApp
```

### 3. Configure MongoDB

Configure your MongoDB connection in `src/main/resources/application.yml`.

Use your own database connection details. Do not commit database credentials or secret keys to GitHub.

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

The application will start using the port configured in your Spring Boot configuration.

## 🧪 API Testing

You can test the REST APIs using Postman.

Example endpoint for user registration:

```http
POST /public/create-user
```

Example endpoint for retrieving a user's journal entries:

```http
GET /journal/{userName}
```

The actual request body and other endpoint details can be found in the controller classes.

## 📚 Learning Resource

This project was developed while following the following YouTube playlist:

**Spring Boot Mastery: From Basics to Advanced**

[Watch the Complete Spring Boot Tutorial Playlist](https://youtube.com/playlist?list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue)

The tutorial series helped me understand and practice Spring Boot concepts and backend development.

## 🎯 What I Learned

Through this project, I gained practical experience with:

- Building RESTful APIs using Spring Boot.
- Understanding layered application architecture.
- Working with MongoDB and Spring Data MongoDB.
- Implementing authentication and authorization using Spring Security.
- Managing user accounts and journal entries.
- Understanding dependency injection and service-layer business logic.
- Working with Maven dependencies and application configuration.
- Exploring backend integrations and asynchronous messaging.

## 👨‍💻 Author

**Suman Malik**

B.Sc. Information Technology Graduate | Java Developer

- GitHub: [SumanMalik22](https://github.com/SumanMalik22)
- LinkedIn: [Connect with me](https://www.linkedin.com/in/sumanmalik221)

---

⭐ If you find this project useful, feel free to explore the repository!

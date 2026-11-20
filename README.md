 <div align="center">

# 📔 Journal App – Spring Boot REST API

**A secure RESTful backend application for managing personal journal entries using Java, Spring Boot, MongoDB, and Spring Security.**

Manage user accounts, create journal entries, and protect personal data through authentication and role-based authorization.

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Backend-6DB33F?logo=springboot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-Database-47A248?logo=mongodb&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Authentication-6DB33F?logo=springsecurity&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white)

</div>

---

## 📌 Table of Contents

- [✨ Project Overview](#-project-overview)
- [🚀 Features](#-features)
- [🔄 Application Workflow](#-application-workflow)
- [🧰 Tech Stack](#-tech-stack)
- [🏗️ Project Architecture](#️-project-architecture)
- [🗄️ Database Design](#️-database-design)
- [🔐 Security](#-security)
- [⚙️ Getting Started](#️-getting-started)
- [🧪 API Testing](#-api-testing)
- [📚 What I Learned](#-what-i-learned)
- [🛣️ Future Improvements](#️-future-improvements)
- [👨‍💻 Author](#-author)

---

## ✨ Project Overview

The **Journal App** is a backend application developed using Java and Spring Boot that allows users to maintain their personal journal entries through REST APIs.

Users can create accounts, authenticate securely, and perform CRUD (Create, Read, Update, Delete) operations on their journal entries.

The application uses MongoDB for data storage and Spring Security to manage authentication and authorization.

This project was developed as a hands-on learning project while following a Spring Boot tutorial series, with practical experience in backend development, database integration, security configuration, and application architecture.

## 🚀 Features

### 👤 User Management
- Create and manage user accounts.
- Store user information in MongoDB.
- Associate journal entries with individual users.

### 📔 Journal Management
- Create new journal entries.
- Retrieve journal entries.
- Update existing journal entries.
- Delete journal entries.
- Associate journal entries with their respective users.

### 🔐 Authentication & Authorization
- Secure application endpoints using Spring Security.
- Authenticate users using Spring Security authentication mechanisms.
- Encrypt passwords using BCrypt.
- Implement role-based access control.
- Restrict access to protected endpoints.

### 🗄️ Database Integration
- MongoDB integration using Spring Data MongoDB.
- Store users and journal entries in separate collections.
- Manage relationships between users and journal entries.

### 📖 API Development
- Build RESTful APIs using Spring Boot and Spring MVC.
- Handle HTTP requests and responses.
- Use controller, service, and repository layers.
- Include OpenAPI/Swagger dependencies for API documentation.

---

## 🔄 Application Workflow

The application follows this general workflow:

```text
          USER
            |
            ▼
      Create Account
            |
            ▼
      User Authentication
            |
            ▼
       Spring Security
            |
            ▼
       Access Journal API
            |
            ▼
    ┌─────────────────────┐
    │   Journal Service   │
    └─────────────────────┘
            |
            ▼
      MongoDB Database
            |
            ▼
     Journal Operations
            |
      ┌─────┼─────┐
      ▼     ▼     ▼
    Create Read Update
                  |
                  ▼
                Delete
```

---

## 🧰 Tech Stack

### Core Technologies

<div align="center">

<img src="https://skillicons.dev/icons?i=java,spring,mongodb,maven,idea,postman,git,github&theme=dark" alt="Java, Spring, MongoDB, Maven, IntelliJ IDEA, Postman, Git and GitHub" />

</div>

| Technology | Purpose |
|---|---|
| **Java 17** | Core programming language |
| **Spring Boot** | Backend application framework |
| **Spring MVC** | REST API development |
| **Spring Security** | Authentication and authorization |
| **Spring Data MongoDB** | Database integration |
| **MongoDB** | NoSQL database |
| **Maven** | Dependency management and build automation |
| **Lombok** | Reducing boilerplate code |
| **Postman** | API testing |
| **IntelliJ IDEA** | Development environment |

### Additional Integrations & Learning

The project also explores dependencies and integrations involving:

- Apache Kafka – Messaging and asynchronous communication.
- Redis – Caching.
- JWT – Token-based authentication.
- OAuth2 – Authorization framework.
- Swagger / OpenAPI – API documentation.
- Email services – Email integration.

*These are additional learning areas and dependencies; their implementation and availability depend on the project version.*

---

## 🏗️ Project Architecture

The application follows a layered architecture to separate responsibilities and improve maintainability.

```text
src/main/java
│
└── com.example.journalApp
    │
    ├── config
    │   └── Spring Security Configuration
    │
    ├── controller
    │   ├── UserController
    │   ├── JournalEntryController
    │   └── PublicController
    │
    ├── entity
    │   ├── User
    │   └── JournalEntry
    │
    ├── repository
    │   ├── UserRepository
    │   └── JournalEntryRepository
    │
    ├── service
    │   ├── UserService
    │   └── JournalEntryService
    │
    ├── security
    │   └── UserDetailsServiceImpl
    │
    └── JournalAppApplication.java
```

### Layer Responsibilities

| Layer | Responsibility |
|---|---|
| Controller | Handles incoming HTTP requests and API responses |
| Service | Contains application business logic |
| Repository | Performs MongoDB database operations |
| Entity | Defines the application's data models |
| Config | Configures application security and other settings |
| Security | Loads user details for authentication |

---

## 🗄️ Database Design

The application uses MongoDB as its primary database.

Two main collections are used:

### 1. Users Collection

Stores user account information.

Example document structure:

```json
{
  "_id": "ObjectId",
  "userName": "john",
  "password": "BCrypt-encoded-password",
  "roles": ["USER"],
  "journalEntries": []
}
```

### 2. Journal Entries Collection

Stores individual journal entries.

Example document structure:

```json
{
  "_id": "ObjectId",
  "title": "My First Journal",
  "content": "Today I learned Spring Boot.",
  "date": "2026-11-20T10:30:00"
}
```

*These are illustrative document structures based on the application's data models.*

---

## 🔐 Security

Security is an important part of this application.

The project uses Spring Security to protect endpoints and manage user access.

Key security concepts explored:

- **BCrypt Password Encoding:** Passwords are encoded before storage.
- **Authentication:** Verifies user credentials.
- **Authorization:** Controls access based on assigned roles.
- **UserDetailsService:** Loads user information for authentication.
- **SecurityFilterChain:** Configures HTTP security rules.
- **DaoAuthenticationProvider:** Connects user-detail retrieval and password verification.

---

## ⚙️ Getting Started

Follow these steps to run the application locally.

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

Open:

```text
src/main/resources/application.yml
```

Configure your MongoDB connection details.

Example:

```yaml
spring:
  data:
    mongodb:
      uri: ${MONGODB_URI}
```

Set the `MONGODB_URI` environment variable with your own connection string.

**Important:** Never commit database credentials, passwords, or secret keys to GitHub.

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

The application will start on the configured Spring Boot server port.

---

## 🧪 API Testing

You can test the REST APIs using Postman.

### Example API Endpoints

| HTTP Method | Endpoint | Purpose |
|---|---|---|
| POST | `/public/create-user` | Register a new user |
| GET | `/journal/{userName}` | Retrieve a user's journal entries |

Additional journal operations include creating, updating, and deleting journal entries.

The actual request bodies, authentication requirements, and complete endpoint mappings can be found in the controller classes.

---

## 📚 What I Learned

Through this project, I gained practical experience with:

- Building RESTful APIs using Spring Boot.
- Understanding layered application architecture.
- Working with MongoDB and Spring Data MongoDB.
- Implementing authentication and authorization using Spring Security.
- Using BCrypt for password encoding.
- Understanding Spring Security's authentication components.
- Managing user accounts and journal entries.
- Working with dependency injection and service-layer business logic.
- Managing Maven dependencies and application configuration.
- Exploring asynchronous messaging and additional backend integrations.

---

## 🛣️ Future Improvements

- Implement JWT-based authentication for stateless API security.
- Expand API documentation using Swagger/OpenAPI.
- Improve exception handling and API response structures.
- Add unit and integration tests.
- Implement additional Kafka-based asynchronous workflows.
- Add caching using Redis.
- Develop a frontend interface for interacting with the APIs.

---

## 👨‍💻 Author

**Suman Malik**

B.Sc. Information Technology Graduate | Java Developer

- GitHub: [SumanMalik22](https://github.com/SumanMalik22)
- LinkedIn: [Connect with me](https://www.linkedin.com/in/sumanmalik221)

---

<div align="center">

**⭐ If you find this project useful, consider giving the repository a star!**

Built with Java, Spring Boot, and a passion for backend development.

</div>

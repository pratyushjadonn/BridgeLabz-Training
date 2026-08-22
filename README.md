# 🚀 Backend Refresher Training

A day-wise learning log of the **BridgeLabz Backend Refresher Program (Java - 20 Day Plan)**.

This repository tracks my daily progress as I strengthen my backend development skills, starting from **Database Fundamentals**, moving to **JDBC Projects**, and then advancing to **Spring Framework**, **Spring Boot**, **Spring Security**, and **Microservices**.

---

# 📚 Technology Stack

- Java
- MySQL
- JDBC
- Spring Framework
- Spring Boot
- Apache Tomcat
- SQL
- Spring Security
- Maven
- Git & GitHub

---

# ✅ Daily Progress Log

## 📅 Day 1 — MySQL Fundamentals & Basic SQL

### Topics Covered

- Introduction to DBMS and RDBMS
- Installing MySQL
- SQL Basics
- DDL Commands
  - CREATE
  - ALTER
  - DROP
- DML Commands
  - INSERT
  - UPDATE
  - DELETE
- SELECT Queries
- Primary Key
- Foreign Key

### Practical Work

- Installed MySQL Server and Workbench
- Created the Health Clinic Database
- Practiced SQL commands by creating tables
- Inserted sample records
- Updated existing records
- Deleted records
- Retrieved data using SELECT queries

### Tables Used for Practice

- Patients
- Doctors
- Appointments

### Learning Outcome

By the end of Day 1, I understood how relational databases work and became comfortable performing basic SQL operations using MySQL.

---

# 📅 Day 2 — Database Design & Normalization

### Topics Covered

- Entity Relationship (ER) Diagram
- Database Relationships
- Cardinality
  - One-to-One
  - One-to-Many
  - Many-to-Many
- Database Normalization
  - First Normal Form (1NF)
  - Second Normal Form (2NF)
  - Third Normal Form (3NF)
- Indexing
- Composite Index
- Foreign Keys
- ON DELETE CASCADE

### Database Designed

The Health Clinic Database consists of the following tables:

| Table | Purpose |
|--------|---------|
| Patients | Stores patient details |
| Patient Phones | Stores multiple phone numbers |
| Doctors | Stores doctor information |
| Specializations | Stores medical specializations |
| Doctor Specializations | Maps doctors to specializations |
| Appointments | Stores appointment records |
| Billing | Stores payment details |
| Visit History | Stores previous visit information |

### Practical Work

- Designed an ER Diagram
- Created normalized tables
- Implemented relationships using foreign keys
- Applied normalization up to 3NF
- Added sample records
- Used indexing to improve query performance

### Learning Outcome

By the end of Day 2, I was able to design a normalized relational database following real-world database design principles.

---

# 📅 Day 3 — Advanced SQL

### Topics Covered

- SQL Joins
  - INNER JOIN
  - LEFT JOIN
  - RIGHT JOIN
  - FULL JOIN (Concept)
- Stored Procedures
- Triggers

### Practical Work

- Retrieved data from multiple tables using joins
- Created stored procedures for reusable database operations
- Implemented triggers for automatic database actions
- Practiced joining patient, doctor, and appointment data

### Learning Outcome

By the end of Day 3, I understood how to retrieve related data efficiently using joins and automate database operations using stored procedures and triggers.

---

# 📅 Day 4 — JDBC Project (Health Clinic Console Application)

### Topics Covered

- JDBC Architecture
- JDBC Driver
- DriverManager
- Connection
- Statement
- PreparedStatement
- ResultSet
- CRUD Operations
- Exception Handling
- DAO Pattern
- DTO Pattern

### Practical Work

Built a **Health Clinic Console Application** using:

- Java
- JDBC
- MySQL

Implemented CRUD operations for:

- Patients
- Doctors
- Appointments

### Features

- Add Patient
- View Patients
- Update Patient
- Delete Patient
- Add Doctor
- View Doctors
- Book Appointment
- View Appointments

### Learning Outcome

By the end of Day 4, I understood how Java communicates with MySQL using JDBC and how to organize code using DAO and DTO patterns.

---

# 📅 Day 5 — Servlet & Spring Framework Fundamentals

### Topics Covered

- Introduction to Web Applications
- Apache Tomcat as Web/Application Server
- Servlet
- Servlet Lifecycle
- Introduction to Spring Framework
- Spring Architecture
- Spring Core
- Inversion of Control (IoC)
- Dependency Injection (DI)
- Spring Bean
- Bean Lifecycle
- XML Configuration Basics

### Practical Work

- Created my first Servlet application
- Learned how Tomcat processes client requests
- Understood the Servlet Lifecycle
- Explored Spring Framework architecture
- Created Spring Beans
- Practiced Dependency Injection using IoC

### Learning Outcome

By the end of Day 5, I understood the core concepts of the Spring Framework, including IoC and Dependency Injection, and how Spring manages object creation and dependencies.

---

# 📅 Day 6 — Greetings Application

### Topics Covered

- Spring Boot basics
- Spring Boot project structure
- Controller
- Request and Response
- REST API basics
- Basic backend application flow

### Practical Work

- Created a Greetings Application
- Practiced handling HTTP requests
- Returned responses from the application
- Understood the basic flow of a Spring Boot application

### Learning Outcome

By the end of Day 6, I became familiar with the basic structure and request-response flow of a Spring Boot backend application.

---

# 📅 Day 7 — Contact Application Backend

### Topics Covered

- Spring Boot project structure
- REST APIs
- Controller
- Service
- Repository
- Entity
- DTO
- CRUD Operations
- Layered Architecture

### Practical Work

- Started the Contact Application backend
- Created the basic project structure
- Worked with Controller, Service and Repository layers
- Implemented contact-related backend operations

### Learning Outcome

By the end of Day 7, I understood how a Spring Boot application is divided into different layers and how those layers work together.

---

# 📅 Day 8 — College Management Application

### Topics Covered

- Spring Boot backend development
- REST APIs
- Layered Architecture
- Entity and DTO
- CRUD Operations
- Backend application structure

### Practical Work

- Created a College Management Application
- Developed the backend structure
- Worked with different application layers
- Implemented college-related backend functionality

### Learning Outcome

By the end of Day 8, I improved my understanding of Spring Boot and learned how to apply layered architecture to a real-world application.

---

# 📅 Day 9 — Global Exception Handling

### Topics Covered

- Exception Handling
- Runtime Exceptions
- Custom Exceptions
- Global Exception Handling
- @ControllerAdvice
- @ExceptionHandler

### Practical Work

- Implemented Global Exception Handling
- Created centralized exception handling
- Handled exceptions outside individual controllers
- Worked on consistent error responses

### Learning Outcome

By the end of Day 9, I understood how to handle exceptions centrally and maintain consistent error responses across REST APIs.

---

# 📅 Day 10 — Contact Application & Contact Mapper

### Topics Covered

- DTO
- Entity
- Mapper
- Entity to DTO conversion
- DTO to Entity conversion
- Separation of responsibilities

### Practical Work

- Continued working on the Contact Application
- Added Contact Mapper
- Implemented Entity to DTO conversion
- Implemented DTO to Entity conversion

### Learning Outcome

By the end of Day 10, I understood the importance of mapper classes and how they keep conversion logic separate from controllers and services.

---

# 📅 Day 11 — Employee Payroll Application

### Topics Covered

- Spring Boot backend development
- REST APIs
- Layered Architecture
- Employee Management
- Business Logic
- CRUD Operations

### Practical Work

- Started the Employee Payroll Application backend
- Created the application structure
- Worked on employee-related functionality
- Implemented backend operations for payroll management

### Learning Outcome

By the end of Day 11, I learned how to apply Spring Boot concepts to a real-world business application.

---

# 📅 Day 12 — Spring Security & Security Filter Chain

### Topics Covered

- Spring Security
- Security Dependencies
- Authentication basics
- Authorization basics
- Security Filter Chain
- SecurityFilterChain

### Practical Work

- Added Spring Security dependencies to the Contact Application
- Configured the Security Filter Chain
- Understood how incoming HTTP requests are filtered
- Learned how security processing happens before requests reach controllers

### Learning Outcome

By the end of Day 12, I understood the basic security flow in Spring Boot and the role of the Security Filter Chain.

---

# 📅 Day 13 — Payroll Application Functionalities

### Topics Covered

- Business Logic
- Spring Boot backend development
- REST APIs
- Service-layer logic
- CRUD Operations

### Practical Work

- Added more functionalities to the Employee Payroll Application
- Implemented additional business-related operations
- Improved the backend functionality of the payroll application

### Learning Outcome

By the end of Day 13, I gained more practical experience in converting business requirements into backend services and APIs.

---

# 📅 Day 14 — Spring Profiles

### Topics Covered

- Spring Profiles
- Environment-specific Configuration
- application.properties
- Profile-specific Configuration
- Development Environment
- Production Environment

### Practical Work

- Worked with Spring Profiling
- Added profile-based configuration
- Understood how different environments can have different configurations
- Practiced separating development and production configurations

### Learning Outcome

By the end of Day 14, I understood how Spring Profiles help manage different environment configurations without changing the application source code.

---

# 📂 Repository Structure

```text
Refresher-Training
│
├── Day-1
├── Day-2
├── Day-3
├── Day-4/HealthClinicApp
├── Day-5/firstServlet
├── Day-6/greetings-app
├── Day-7/ContactApp
├── Day-8/college-management
├── Day-9
├── Day-10/ContactsApp
├── Day-11/payroll-app
├── Day-12/ContactsApp
├── Day-13
├── Day-14
└── README.md
```

---

# 🎯 Learning Goals

- Master SQL and Database Design
- Build Console Applications using JDBC
- Understand Servlet and Tomcat
- Learn Spring Framework Fundamentals
- Understand IoC and Dependency Injection
- Develop REST APIs using Spring Boot
- Learn DTO and Mapper patterns
- Implement Global Exception Handling
- Understand Spring Security
- Learn Spring Profiles
- Learn Hibernate & JPA
- Build Microservices using Spring Cloud
- Follow Clean Code and Backend Best Practices

---

# 📌 Current Progress

| Day | Topic | Status |
|------|--------|--------|
| Day 1 | MySQL Fundamentals & Basic SQL | ✅ Completed |
| Day 2 | Database Design & Normalization | ✅ Completed |
| Day 3 | Advanced SQL - Joins, Procedures & Triggers | ✅ Completed |
| Day 4 | Health Clinic JDBC Project | ✅ Completed |
| Day 5 | Servlet, Tomcat & Spring IoC | ✅ Completed |
| Day 6 | Greetings Application | ✅ Completed |
| Day 7 | Contact Application | ✅ Completed |
| Day 8 | College Management Application | ✅ Completed |
| Day 9 | Global Exception Handling | ✅ Completed |
| Day 10 | Contact Mapper | ✅ Completed |
| Day 11 | Employee Payroll Application | ✅ Completed |
| Day 12 | Spring Security & Filter Chain | ✅ Completed |
| Day 13 | Payroll Application Functionalities | ✅ Completed |
| Day 14 | Spring Profiles | ✅ Completed |
| Day 15–20 | Coming Soon | ⏳ In Progress |

---

# 📖 Author

**Pratyush**

Backend Refresher Training Repository

Java • JDBC • MySQL • Spring • Spring Boot • Spring Security • Microservices

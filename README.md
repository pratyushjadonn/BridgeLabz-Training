# 🚀 Backend Refresher Training

A day-wise learning log of the **BridgeLabz Backend Refresher Program (Java - 20 Day Plan)**.

This repository tracks my daily progress as I strengthen my backend development skills, starting from **Database Fundamentals**, moving to **JDBC Projects**, and then advancing to **Spring Framework**, **Spring Boot**, and **Microservices**.

---

# 📚 Technology Stack

- Java
- MySQL
- JDBC
- Spring Framework
- Apache Tomcat
- SQL
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
- Created a Health Clinic Database
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
- Created all normalized tables
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

# 📅 Day 5 — Spring Framework Fundamentals

### Topics Covered

- Introduction to Web Applications
- Apache Tomcat as Web/Application Server
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

- Learned how Tomcat processes client requests
- Understood the complete Servlet Lifecycle
- Explored Spring Framework architecture
- Created Spring Beans
- Implemented Dependency Injection using IoC
- Understood how Spring manages application objects

### Learning Outcome

By the end of Day 5, I understood the core concepts of the Spring Framework, including IoC and Dependency Injection, and how Spring simplifies Java application development by managing object creation and dependencies.

---

# 📂 Repository Structure

```
Backend-Refresher-Training
│
├── Day-01-MySQL
├── Day-02-Database-Design
├── Day-03-Advanced-SQL
├── Day-04-JDBC-Health-Clinic
├── Day-05-Spring-Core
└── README.md
```

---

# 🎯 Learning Goals

- Master SQL and Database Design
- Build Console Applications using JDBC
- Understand Spring Framework Fundamentals
- Develop REST APIs using Spring Boot
- Learn Hibernate & JPA
- Build Microservices using Spring Cloud
- Follow Clean Code and Best Practices

---

# 📌 Current Progress

| Day | Topic | Status |
|------|--------|--------|
| Day 1 | MySQL Fundamentals | ✅ Completed |
| Day 2 | Database Design & Normalization | ✅ Completed |
| Day 3 | Advanced SQL (Joins, Procedures, Triggers) | ✅ Completed |
| Day 4 | JDBC Health Clinic Project | ✅ Completed |
| Day 5 | Spring Framework Fundamentals | ✅ Completed |
| Day 6–20 | Coming Soon | ⏳ In Progress |

---

# 📖 Author

**Pratyush**

Backend Refresher Training Repository

Java • JDBC • MySQL • Spring • Spring Boot • Microservices
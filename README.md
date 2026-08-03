🚀 Backend Refresher Training

A day-wise learning log of the BridgeLabz Backend Refresher Program (Java - 20 Day Plan). This repo tracks daily progress — starting with Database fundamentals, moving into Spring / Spring Boot, and finally into Microservices.

✅ Daily Progress Log

Below is the detailed log of days completed so far.

📅 Day 1 — DBMS Fundamentals & MySQL
What I Learned:
Difference between DBMS and RDBMS
How to install MySQL
Basics of SQL
DDL commands (to create/modify database structure)
DML commands (to work with actual data)
What a Primary Key is
What a Foreign Key is
What I Did:
Installed MySQL on my system
Created the Health Clinic Database
Practiced basic SQL queries
Ran CREATE, INSERT, UPDATE, DELETE, and SELECT queries to get comfortable with SQL
Takeaway:

By the end of Day 1, I understood how relational databases work and could confidently run basic SQL operations.

📅 Day 2 — Database Design & Normalization
What I Learned:
How to draw an ER Diagram
Types of Relationships between tables
Cardinality (one-to-one, one-to-many, many-to-many)
Normal forms: 1NF, 2NF, 3NF
Indexing for faster queries
Tables I Created:
Table	Purpose
Patients	Stores patient details
Patient Phones	Stores multiple phone numbers per patient
Doctors	Stores doctor details
Specializations	List of medical specializations
Doctor Specializations	Links doctors to their specializations
Appointments	Manages patient-doctor appointments
Billing	Stores billing/payment info
Visit History	Keeps a record of past visits
Concepts I Applied
One-to-Many relationship (e.g., one doctor → many appointments)
Many-to-Many relationship (e.g., doctors ↔ specializations)
One-to-One relationship
Foreign Keys to connect related tables
Composite Index for better query performance
ON DELETE CASCADE to keep data consistent when a record is deleted
Sample Data Added
A sample patient
A sample doctor
A few specializations
A booked appointment
Billing details
Visit history entry
Takeaway:

By the end of Day 2, I designed a properly normalized database (following 3NF) for the clinic, with all tables connected using foreign keys — just like a real-world system would need.
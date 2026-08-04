-- ============================================================
-- Health Clinic Console Application - Database Schema
-- Day 4 Final Project
-- ============================================================

DROP DATABASE IF EXISTS health_clinic_db;
CREATE DATABASE health_clinic_db;
USE health_clinic_db;

-- ------------------------------------------------------------
-- Table: specializations
-- ------------------------------------------------------------
CREATE TABLE specializations (
    specialization_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255)
);

-- ------------------------------------------------------------
-- Table: doctors
-- ------------------------------------------------------------
CREATE TABLE doctors (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    specialization_id INT,
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(20),
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    CONSTRAINT fk_doctor_specialization
        FOREIGN KEY (specialization_id) REFERENCES specializations(specialization_id)
        ON DELETE SET NULL
);

-- ------------------------------------------------------------
-- Table: patients
-- ------------------------------------------------------------
CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    gender VARCHAR(10),
    email VARCHAR(100) UNIQUE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE
);

-- ------------------------------------------------------------
-- Table: appointments
-- ------------------------------------------------------------
CREATE TABLE appointments (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATETIME NOT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'Scheduled',
    CONSTRAINT fk_appt_patient FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
    CONSTRAINT fk_appt_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
);

-- ------------------------------------------------------------
-- Table: billing
-- ------------------------------------------------------------
CREATE TABLE billing (
    billing_id INT AUTO_INCREMENT PRIMARY KEY,
    appointment_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    payment_status VARCHAR(20) NOT NULL DEFAULT 'Pending',
    billed_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_billing_appointment FOREIGN KEY (appointment_id) REFERENCES appointments(appointment_id)
);

-- ------------------------------------------------------------
-- Table: visit_history
-- ------------------------------------------------------------
CREATE TABLE visit_history (
    visit_id INT AUTO_INCREMENT PRIMARY KEY,
    appointment_id INT NOT NULL,
    diagnosis VARCHAR(255),
    prescription VARCHAR(255),
    visit_notes VARCHAR(500),
    recorded_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_visit_appointment FOREIGN KEY (appointment_id) REFERENCES appointments(appointment_id)
);

-- ------------------------------------------------------------
-- Least-privilege application user (never use root in app code)
-- ------------------------------------------------------------
CREATE USER IF NOT EXISTS 'clinic_app_user'@'localhost' IDENTIFIED BY 'StrongPassword123!';
GRANT SELECT, INSERT, UPDATE, DELETE ON health_clinic_db.* TO 'clinic_app_user'@'localhost';
FLUSH PRIVILEGES;

-- ------------------------------------------------------------
-- Sample Data
-- ------------------------------------------------------------
INSERT INTO specializations (name, description) VALUES
('Cardiology', 'Heart and cardiovascular system'),
('Dermatology', 'Skin conditions'),
('General Medicine', 'General checkups and common illnesses');

INSERT INTO doctors (first_name, last_name, specialization_id, email, phone) VALUES
('Anjali', 'Rao', 1, 'anjali.rao@clinic.com', '9990001111'),
('Vikram', 'Iyer', 3, 'vikram.iyer@clinic.com', '9990002222');

INSERT INTO patients (first_name, last_name, date_of_birth, gender, email) VALUES
('Ramesh', 'Kumar', '1985-04-12', 'Male', 'ramesh.kumar@example.com'),
('Sita', 'Sharma', '1990-09-23', 'Female', 'sita.sharma@example.com');

INSERT INTO appointments (patient_id, doctor_id, appointment_date, status) VALUES
(1, 1, '2026-08-10 10:00:00', 'Scheduled'),
(2, 2, '2026-08-11 11:30:00', 'Scheduled');

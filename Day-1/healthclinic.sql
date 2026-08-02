Create database if  not exists health_clinic_db;
use health_clinic_db;
CREATE TABLE patients(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    gender VARCHAR(10),
    phone VARCHAR(15)
);
CREATE TABLE doctors(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    specialization VARCHAR(100),
    phone VARCHAR(15)
);
CREATE TABLE appointments(
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT,
    doctor_id INT,
    appointment_date DATE
);
create table specializations(
id int primary key auto_increment,
name varchar(100),
description varchar(255)
);
insert into specializations(name , description)
values
('Cardiology','Heart specialist doctor'),
('Neurology','Brain specialist doctor'),
('Orthopedics','Bone specialist doctor');
select * from specializations;
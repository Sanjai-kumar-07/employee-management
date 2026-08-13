# Employee Management System

A RESTful Employee Management System built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

This project provides APIs to create, retrieve, update, and delete employee records.

## 🚀 Features

- Add a new employee
- Get all employees
- Get employee by ID
- Update employee details
- Delete an employee
- MySQL database integration
- RESTful APIs
- JPA/Hibernate database operations
- Swagger API documentation
- Postman API testing

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger / OpenAPI
- Postman
- Git & GitHub

## 🏗️ Project Architecture

```text
Client (Postman / Swagger)
          |
          ↓
     Controller
          |
          ↓
       Service
          |
          ↓
     Repository
          |
          ↓
   Spring Data JPA
          |
          ↓
        MySQL


## 📁 Project Structure

employee-management/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/employee_management/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── EmployeeManagementApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
# Employee Management System

A backend Employee Management System built using Java and Spring Boot.

This project provides REST APIs to manage employees with JWT-based authentication and role-based authorization.

## Features

- Employee CRUD operations
- RESTful APIs
- JWT Authentication
- Role-Based Authorization
- HR-only Update and Delete access
- Public Employee GET API
- Secure POST, PUT and DELETE APIs
- Password encryption using BCrypt
- MySQL database integration
- Postman API testing

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA

## Security

This project uses JWT authentication and role-based authorization.

### Access Control

| Operation | Access |
|---|---|
| GET Employees | Public |
| POST Employee | Authenticated User |
| PUT Employee | HR Only |
| DELETE Employee | HR Only |

### Authentication Responses

- No JWT token → `401 Unauthorized`
- Employee token for HR-only operation → `403 Forbidden`
- Valid HR token → Request allowed

## API Endpoints

### Authentication

```text
POST /auth/login


src
└── main
    ├── java
    │   └── com.example.employee_management
    │       ├── config
    │       │   └── SecurityConfig.java
    │       ├── controller
    │       ├── entity
    │       ├── repository
    │       └── service
    │           └── JwtAuthenticationFilter.java
    │
    └── resources
        └── application.properties


## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Sanjai-kumar-07/employee-management.git

## Testing

The APIs were tested using Postman.

### Tested Scenarios

- GET employees without authentication
- GET employee by ID
- POST employee with authentication
- PUT employee with HR authentication
- DELETE employee with HR authentication
- Unauthorized requests without JWT
- Forbidden requests using non-HR roles

### Security Testing

- GET API → Public access
- POST API → Authentication required
- PUT API → HR role required
- DELETE API → HR role required
- No JWT token → `401 Unauthorized`
- Employee token for HR operation → `403 Forbidden`
- HR token → Request successful

## Future Improvements

- Add pagination and sorting
- Add employee search functionality
- Add Swagger/OpenAPI documentation
- Add global exception handling
- Add unit and integration tests
- Add frontend interface
- Deploy the application to the cloud

## Author

**Sanjai Kumar**

GitHub:  
https://github.com/Sanjai-kumar-07


## Project Description

Employee Management System is a secure backend application developed using Java and Spring Boot.

The application provides employee management REST APIs with JWT authentication and role-based authorization. Employee data can be viewed publicly, while employee creation requires authentication and update/delete operations are restricted to HR users.

The project demonstrates practical implementation of Spring Boot, Spring Security, JWT, REST APIs, JPA, Hibernate, and MySQL.
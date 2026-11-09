# CRUD User Management Application

A Java EE web application for managing user records through a web interface.

## Overview

This project demonstrates a traditional Java web application architecture using Java Servlets, JSP pages, a DAO layer, and JDBC for database access.

## Features

- User login interface
- Create a user
- Display the list of users
- Update user information
- Delete a user

## Technology Stack

- Java
- Java Servlets
- JSP (JavaServer Pages)
- JDBC
- MySQL
- Apache Tomcat / Java web application structure

## Project Structure

```text
src/
├── beans/       # User model
├── dao/         # Database access and CRUD operations
├── filters/     # Web filters
├── forms/       # Form-related classes
└── servlets/    # Login and user management controllers

WebContent/
└── WEB-INF/     # JSP views and web.xml configuration
```

## Database

The DAO layer connects to a MySQL database named `jee` and uses a `users` table.

Before running the application, configure the database connection in `src/dao/UtilisateurDao.java` for your local environment. Do not commit real passwords or production credentials.

## Learning Objectives

This project was built to practice:
- Java web application structure
- MVC-style separation between models, DAO classes, servlets, and JSP views
- JDBC and SQL operations
- Basic authentication flow and CRUD operations

## Author

Raky Gueye

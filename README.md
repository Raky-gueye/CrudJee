# CRUD User Management Application

A Java EE web application for managing users with authentication and database-backed CRUD operations.

## Overview

This academic project demonstrates how to build a Java web application connected to a MySQL database. Users can log in to access protected pages and manage user records through a web interface.

The application uses a DAO (Data Access Object) layer to separate database operations from the web layer.

## Features

- **Authentication:** login with username and password.
- **Session management:** maintain an authenticated session and log out.
- **Protected pages:** restrict access to user-management pages through a web filter.
- **List users:** display users stored in the database.
- **Create users:** add a user with form validation, including required fields and password confirmation.
- **Update users:** edit an existing user's information.
- **Delete users:** remove a user after a confirmation step.
- **Database persistence:** store and retrieve user records from MySQL.

## Technologies

- Java
- Java EE
- Java Servlets
- JSP (JavaServer Pages)
- JDBC
- MySQL
- SQL
- HTML, CSS and JavaScript

## Architecture

The project follows an MVC-style organization:

- **Beans:** user model and data representation.
- **DAO:** database connection and SQL operations.
- **Servlets:** handle authentication and user-management requests.
- **Filters:** protect pages that require authentication.
- **JSP:** render the application interface.

## Project Structure

```text
src/
├── beans/       # User model
├── dao/         # Database access and CRUD operations
├── filters/     # Authentication filters
├── forms/       # Form-related classes
└── servlets/    # Login and user management controllers

WebContent/
└── WEB-INF/     # JSP views and web.xml configuration
```

## Database

The application uses a MySQL database named `jee` and a `users` table containing user information such as ID, name, first name, login and password.

Configure the database connection in `src/dao/UtilisateurDao.java` to match your local MySQL environment before running the application. Do not commit real passwords or production credentials.

## Run Locally

1. Create the MySQL database and the required `users` table.
2. Configure the JDBC connection in `UtilisateurDao.java`.
3. Import the project into a Java EE-compatible IDE.
4. Configure a compatible servlet container, such as Apache Tomcat.
5. Deploy the application and open it in your browser.

## Demo

[Watch the project demonstration on YouTube](https://www.youtube.com/watch?v=EtXwKayDG1k)

## Learning Objectives

This project helped practice Java web development, JDBC database connectivity, DAO organization, authentication and session handling, servlet filters, and CRUD operations.

## Author

Raky Gueye

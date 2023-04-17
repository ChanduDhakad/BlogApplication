# BlogApplication

The Masai Blog Application is a REST API that allows users to register, log in, and publish blogs. Users can also comment on other users' blogs, view all blogs, and delete their own blogs and comments.

# Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger UI
- Lambok
- Maven


# Modules

- User Module
- Event Module


# Validation
- This project uses validation annotations to ensure that user input is in the correct format. The following validations are implemented:

- First Name: Must not contain numbers or special characters
- Last Name: Must not contain numbers or special characters
- Email: Must be a valid email address
- Age: Must be above 12 years
- Gender: Must be either "male" or "female"
- Password: Must be alphanumeric and contain 6-12 characters with at least one special character, one upper case, one lowercase, and one digit


# Exception Handling
- Custom exceptions are used for handling errors in the application. A global exception handler is used to handle exceptions globally.

# Authentication
- Basic authentication is implemented for user registration and login.




# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/masaiblogdb
spring.datasource.username=root
spring.datasource.password=password

```

# API Root Endpoint
```
https://localhost:8080/
```
```
http://localhost:8080/swagger-ui/
```

# product_Category_Springboot

This project is a Spring Boot application that demonstrates CRUD operations for *Categories* and *Products* with *One-to-Many Relationship* and *Pagination Support* using:

- Spring Boot
- Spring Data JPA
- Hibernate
- REST API
- MySQL Database

## Features

- Category CRUD APIs
- Product CRUD APIs
- One-to-Many relation (One Category → Many Products)
- Pagination support on GET all APIs
- Single product fetch returns category details

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST API

## API Endpoints

### Category APIs

| Method | URL | Description |
|--------|-----|-------------|
| GET    | /api/categories?page=0 | Get all categories with pagination |
| POST   | /api/categories | Create a new category |
| GET    | /api/categories/{id} | Get category by ID |
| PUT    | /api/categories/{id} | Update category by ID |
| DELETE | /api/categories/{id} | Delete category by ID |

### Product APIs

| Method | URL | Description |
|--------|-----|-------------|
| GET    | /api/products?page=0 | Get all products with pagination |
| POST   | /api/products | Create a new product |
| GET    | /api/products/{id} | Get product by ID (includes category details) |
| PUT    | /api/products/{id} | Update product by ID |
| DELETE | /api/products/{id} | Delete product by ID |

## MySQL Configuration

Update your application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

> Note: Replace yourdb, root, and yourpassword with your actual database credentials.

Running the Project

1. Clone the repository.
2. Create MySQL database.
3. Update database config in application.properties.
4. Run the project from DemoApplication.java.


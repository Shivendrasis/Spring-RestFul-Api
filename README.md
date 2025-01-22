# REST API - Books

A simple REST API project for managing books, built using **Java**, **Spring Boot**, and **Hibernate**.

## Features
- Create, Read, Update, and Delete (CRUD) operations for books.
- Supports JSON request and response.
- Integrated with a MySQL database for data persistence.

## Prerequisites
Make sure you have the following installed:
- Java 17+
- Maven 3.8+
- MySQL Server

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Shivendra-Digital/restapi-books.git
   cd restapi-books
   ```
2. Configure the database:
   - Update the `application.properties` file in the `src/main/resources` directory with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/books_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```
3. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
| HTTP Method | Endpoint          | Description               |
|-------------|-------------------|---------------------------|
| GET         | `/api/books`      | Get all books             |
| GET         | `/api/books/{id}` | Get book by ID            |
| POST        | `/api/books`      | Add a new book            |
| PUT         | `/api/books/{id}` | Update an existing book   |
| DELETE      | `/api/books/{id}` | Delete a book by ID       |

## Technologies Used
- **Java**
- **Spring Boot**
- **Hibernate**
- **MySQL**

## License
This project is licensed under the [MIT License](LICENSE).

---

### Connect with Me
- [LinkedIn](https://www.linkedin.com/in/shivendra-sisodia)
- [GitHub](https://github.com/Shivendra-Digital)

# Student Management System

## Overview
This project is a CRUD (Create, Read, Update, Delete) application for managing student information using Java Spring Boot.

## Features
- Create new student records
- Read existing student information
- Update student details
- Delete student records

## Prerequisites
Before you begin, ensure you have the following installed:
- Java (latest version)
- Java IDE (IntelliJ IDEA or Eclipse)
- MySQL Workbench

## Setup
1. Clone the repository:
   ```
   git clone https://github.com/SIBI-RANGANATH-L/StudentManagementSystem.git
   ```

2. Open the project in your preferred Java IDE.

3. Configure the database connection:
   - Open the `application.properties` file.
   - Update the database credentials to match your MySQL schema:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/your_schema_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

4. Run the server:
   - Locate the main application class (usually annotated with `@SpringBootApplication`).
   - Right-click on the file and select "Run" or "Run As Spring Boot App".

## Usage
Once the server is running, you can interact with the Student Management System through its API endpoints. Use tools like Postman or curl to send HTTP requests to perform CRUD operations on student records.

## Contributing
Contributions to improve the Student Management System are welcome. Please feel free to submit pull requests or open issues to discuss potential changes or enhancements.


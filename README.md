# Metro POS System

A desktop Point-of-Sale (POS) application for supermarkets and retail stores, built with Java and Java Swing.
Developed by Muhammad Saad (GitHub: @Saad7938).

Metro POS System provides billing, inventory and product management, cashier workflows, and printable invoices with a simple role-based GUI.

## Key Features

- Sales / Billing
  - Add items to cart, update quantities, remove items
  - Auto price calculation, subtotal, tax, discounts, grand total
  - Generate and print final invoice
- Inventory & Product Management
  - Add, edit, delete products
  - Manage categories
  - Track stock quantity and low-stock alerts
- User Management
  - Admin and Cashier user roles
  - Role-based access to views and actions
- Invoice / Receipt
  - Auto-generated invoice numbers
  - Transaction detail view and printable layout
- UI & Experience
  - Java Swing GUI with forms and tables
  - Input validation and user-friendly error messages
- Architecture
  - MVC-style project structure (models, views, controllers/services)
  - MySQL as the back-end database
  - Built with Maven

## Tech Stack

- Language: Java (JDK 17)
- GUI: Java Swing
- Build: Maven
- Database: MySQL (generic instructions)
- Architecture: MVC-style

## Prerequisites

- JDK 17
- Maven 3.x
- MySQL server
- Recommended IDE: IntelliJ IDEA / Eclipse / NetBeans

## Important files discovered in the repository

- Main application entry: org.example.MetroPOSApplication (src/main/java/org/example/MetroPOSApplication.java)
  - This class launches the Swing UI (SplashScreen -> LoginView).
- Database configuration: src/main/java/org/example/config/DatabaseConfig.java
  - Default values in repository:
    - URL: jdbc:mysql://localhost:3306/metropos
    - USERNAME: root
    - PASSWORD: root
  - Edit this file to point to your MySQL instance and credentials before running the application.
- Views: src/main/java/org/example/view/
  - SplashScreen, LoginView, and role-specific dashboards (DataEntryDashboard, BranchManagerDashboard, etc.)
- Controllers & Services: src/main/java/org/example/controller/, src/main/java/org/example/service/
- Models: src/main/java/org/example/model/ (product, sale, user, report, branch)
- Repositories (stubs): src/main/java/org/example/repository/ (basic save/find stubs)

## Database setup

This repository does not include a SQL dump. To prepare the database:

1. Create a database (example name: metropos):
   CREATE DATABASE metropos;

2. Create required tables. The repository contains model classes (e.g., User, Product, Sale) but not a schema SQL. Example minimal tables you can create:

   CREATE TABLE users (
     id INT AUTO_INCREMENT PRIMARY KEY,
     username VARCHAR(50) UNIQUE NOT NULL,
     password VARCHAR(255) NOT NULL,
     role VARCHAR(20),
     first_login BOOLEAN DEFAULT TRUE
   );

   CREATE TABLE categories (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(100) NOT NULL,
     description TEXT
   );

   CREATE TABLE products (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(150) NOT NULL,
     code VARCHAR(50) UNIQUE,
     category_id INT,
     price DECIMAL(10,2) NOT NULL,
     qty INT DEFAULT 0
   );

   CREATE TABLE sales (
     id INT AUTO_INCREMENT PRIMARY KEY,
     invoice_no VARCHAR(100) NOT NULL,
     user_id INT,
     total DECIMAL(12,2),
     date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );

   CREATE TABLE sale_items (
     id INT AUTO_INCREMENT PRIMARY KEY,
     sale_id INT,
     product_id INT,
     qty INT,
     price DECIMAL(10,2)
   );

Adjust schema according to the application's needs.

## Configure database connection

Before running, update src/main/java/org/example/config/DatabaseConfig.java with your DB URL, username and password. The file currently uses jdbc:mysql://localhost:3306/metropos and root/root — change these for production.

Example JDBC URL:
  jdbc:mysql://localhost:3306/metropos?useSSL=false&serverTimezone=UTC

## Build & Run

1. Build with Maven:
   mvn clean package

2. Run from IDE: Run the main class org.example.MetroPOSApplication

3. Or run packaged JAR (if the project is packaged as an executable JAR):
   java -jar target/<artifact-id>-<version>.jar

## Notes about the project state

- Many repository classes (repositories, services, model methods) are implemented as stubs or contain placeholder methods. The app scaffolding, Swing views, and controllers are present and show the intended architecture, but some backend persistence logic may be incomplete.
- AuthService.login currently returns false (placeholder). Update UserRepository and AuthService to connect to your database and implement authentication.

## Troubleshooting

- If the application cannot connect to the database, ensure MySQL is running and DatabaseConfig has correct credentials.
- If build fails, verify JDK 17 and Maven are installed and configured.

## Contributing

Contributions are welcome. Typical workflow:
1. Fork the repository
2. Create a feature branch
3. Make changes and test locally
4. Open a pull request

## Contact

Developed by Muhammad Saad — GitHub: @Saad7938

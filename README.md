# Spring Boot Prometheus Grafana Sample

This project demonstrates the integration of Spring Boot with Prometheus and Grafana for monitoring and visualization.

## Project Overview

This sample application is a Spring Boot project that exposes RESTful endpoints for user management. It includes:

- Spring Boot 3.4.2
- Spring Data JPA
- H2 Database
- Prometheus for metrics collection
- Grafana for metrics visualization

## Prerequisites

- Java 21
- Maven
- Docker and Docker Compose (for running Prometheus and Grafana)

## Getting Started

1. Build the project:
   ```
   ./mvnw clean package
   ```

2. Run the Spring Boot application:
   ```
   ./mvnw spring-boot:run
   ```

3. Start Prometheus and Grafana:
   ```
   cd ci
   docker-compose up -d
   ```

## Accessing the Application

- Spring Boot application: http://localhost:8080
- H2 Console: http://localhost:8080/h2-console
- Prometheus: http://localhost:9090
- Grafana: http://localhost:3000 (default credentials: admin/admin)

## API Endpoints

- Create User: POST http://localhost:8080/v1/users
- Get User: GET http://localhost:8080/v1/users/{id}
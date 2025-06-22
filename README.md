🛒 Handcart App Backend
A microservices-based backend system for a shopping application built with Spring Boot, showcasing scalable architecture, inter-service communication, service discovery, logging, and monitoring.

🚀 Tech Stack
Java 11+

Spring Boot

Spring Cloud (Eureka, Config, Gateway)

MySQL (for Order Service)

MongoDB (for Product Service)

Spring Cloud Gateway

Feign Client + Resilience4j (for inter-service communication & circuit breakers)

Zipkin (for distributed tracing)

Eureka Server & Clients (for service discovery)

Spring Logging (for centralized logging)

📦 Microservices Overview
🧾 API Gateway
Handles routing to backend services

Centralized authentication and request filtering

🛍️ Product Service
Stores product data in MongoDB

CRUD operations for product catalog

📦 Inventory Service
Manages stock levels

Communicates with Product and Order Services

📑 Order Service
Manages orders and transactions

Uses MySQL for persistent storage

Validates product availability via Inventory Service

🔍 Discovery Service
Eureka Server for registering and discovering microservices dynamically

🔄 Inter-Service Communication
Feign Clients for easy declarative REST clients

Resilience4j Circuit Breakers for fault tolerance and service fallback handling

🔎 Observability
Spring Logging for standard logs

Zipkin integration for distributed request tracing

📂 Folder Structure (High-Level)
arduino
Copy
Edit
shopping-backend/
├── api-gateway/
├── discovery-service/
├── inventory-service/
├── order-service/
├── product-service/
└── common-config/
✅ Features
Modular microservice architecture

Load-balanced service communication

Fault tolerance with circuit breakers

Centralized logging and distributed tracing

Database abstraction: MySQL and MongoDB used strategically

Easily deployable in hybrid or cloud-native environments

🧪 Future Enhancements (Optional)
JWT-based authentication

Dockerization & Kubernetes deployment

Kafka integration for async processing



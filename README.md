🧠 Kata 3 – Microservices Composition with Contract-First Approach 🚀
This project simulates a real-world architecture where multiple microservices collaborate to provide a unified business solution. I developed it as part of my training, applying contract-first design and OpenAPI to define robust and scalable service interactions.

🎯 Goal
To build a solution consisting of three independent microservices that work together to manage products and suppliers, using OpenAPI (Swagger) to define and generate communication contracts. This kata builds upon the foundation laid in Kata 1.

🛠️ Project Overview
The solution includes:

Products Microservice 📦
Manages all information related to products.

Providers Microservice 🧑‍💼
Manages information about suppliers.

Composition Microservice 🧩
Aggregates data from both the Products and Providers services, exposing a unified API.

📌 OpenAPI definitions are used to generate both client and server artifacts through the openapi-generator-maven-plugin.


🧱 Technologies
Java 17+

Spring Boot

OpenAPI / Swagger

Maven

Contract-first approach

openapi-generator-maven-plugin

PostgreSQL (shared or isolated databases)

RESTful API design

📐 Microservice Endpoints (Composition)
Action	Endpoint	Description
➕ Create provider	POST /providers	Registers a new provider.
➕ Create product for provider	POST /providers/{id}/products	Adds a new product under a specific provider.
🔍 Get product by ID	GET /providers/{id}/products/{productId}	Retrieves a specific product by its ID under a provider.
🗑️ Delete product	DELETE /providers/{id}/products/{productId}	Deletes a product associated with a provider.


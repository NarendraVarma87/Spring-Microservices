## Spring-Microservices

# Introduction
Spring-Microservices is a beginner-level project aimed at demonstrating the basic setup and interaction between microservices using Spring Boot. 
This project showcases simple service-to-service communication via Feign Client, as well as a reactive approach using WebClient with Spring WebFlux.
For service discovery and management, Eureka Server is utilized, allowing each service to register and locate other services in the network.

# Features
-> <strong>Service Discovery:</strong> Utilizing Eureka Server for service registration and discovery.

-> <strong>Inter-service Communication:</strong> Demonstrates basic microservice communication using <strong>Feign Client:</strong> For declarative REST client communication.

-> <strong>WebClient:</strong> As part of the Spring WebFlux for reactive programming.

-> <strong>Simple String Operations:</strong> Each microservice is designed to perform basic string operations as a demonstration of inter-service communication without involving database operations.

-> <strong>Dynamic Port Configuration:</strong> Services are configured to run on different ports to mimic a real microservices environment.

## Technologies Used
<ul>
<li>Spring Boot for the overall microservice framework.</li>
<li>Netflix Eureka for service discovery.</li>
<li>Feign Client for easy RESTful service consumption.</li>
<li>Spring WebFlux and WebClient for reactive programming.</li>
<li>Maven for project management and build.</li>
</ul>


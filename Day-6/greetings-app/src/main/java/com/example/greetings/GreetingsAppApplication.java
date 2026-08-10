package com.example.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for "My Greetings App".
 *
 * This is a standalone Spring MVC application (Spring Boot with an
 * embedded Tomcat server), so it can be run directly with:
 *   mvn spring-boot:run
 * or packaged as a jar and run with:
 *   java -jar target/greetings-app.jar
 */
@SpringBootApplication
public class GreetingsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingsAppApplication.class, args);
    }
}

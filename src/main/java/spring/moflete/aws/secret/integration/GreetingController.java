package spring.moflete.aws.secret.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greet() {
        return "Hello! Welcome to the Java Spring Boot REST API.";
    }
}
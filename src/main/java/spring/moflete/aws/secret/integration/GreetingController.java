package spring.moflete.aws.secret.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetingController {

    @Value("${my-test-value}")
    private String awsKey;

    @GetMapping("/greeting")
    public String greet() {
        String rawThing = awsKey;
        Optional<String> meeting = Optional.ofNullable(awsKey);
        Optional<String> meeting2 = Optional.ofNullable("Test");

        return "Hello! Welcome to the Java Spring Boot REST API - ";
    }
}
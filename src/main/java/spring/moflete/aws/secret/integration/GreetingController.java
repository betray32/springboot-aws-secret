package spring.moflete.aws.secret.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetingController {

    @Value("${aws.key.efhas.be}")
    private String awsKey;

    @Autowired
    GetSecretValue getSecretValue;


    @GetMapping("/greeting")
    public String greet() {
        Optional<String> value = getSecretValue.getValue(awsKey);

        return "Hello! Welcome to the Java Spring Boot REST API - ";
    }
}
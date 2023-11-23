package spring.moflete.aws.secret.integration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class CommandLineApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Automatic run...");
    }
}
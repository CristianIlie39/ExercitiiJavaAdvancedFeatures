package entryPoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = {"frontend", "business.service", "persistence.dao"})
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        System.out.println("Application started");
        System.out.println("Application running");

    }
}
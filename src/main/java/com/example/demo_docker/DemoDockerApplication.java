package com.example.demo_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoDockerApplication {
	@RequestMapping("/")
        public String home() {
                return "Hello World!";
        }

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}

package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("Hello World");
	}

	@GetMapping("/secret")
	public String helloSecret() {
		return String.format("Hello Secret");
	}

	@GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return String.format("logout");
    }

}

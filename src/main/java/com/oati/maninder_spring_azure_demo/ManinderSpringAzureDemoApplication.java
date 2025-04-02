package com.oati.maninder_spring_azure_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ManinderSpringAzureDemoApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Congratulation Tested again!!! ManinderSpringAzureDemo is deployed successfully.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ManinderSpringAzureDemoApplication.class, args);
		System.out.println("----Started ManinderSpringAzureDemoApplication---");
	}

}

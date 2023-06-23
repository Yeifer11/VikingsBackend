package com.viking.viking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VikingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VikingApplication.class, args);
		
		System.out.println("Hello Word");
	}

}

package com.github.pedroluiznogueira.citiesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesApiApplication.class, args);
		System.out.println("Good to go...");
	}

}

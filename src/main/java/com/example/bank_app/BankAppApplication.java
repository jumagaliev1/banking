package com.example.bank_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BankAppApplication extends SpringBootServletInitializer  {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(BankAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BankAppApplication.class, args);
	}

}

package com.example.demo;

import com.example.demo.data.Employee;
import com.example.demo.data.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EmployeeManagementApplication {

	private static final Logger log = LoggerFactory.getLogger(EmployeeManagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(@Autowired EmployeeRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Employee(1L, "Dilip Kumar", "IN3")));
			log.info("Preloading " + repository.save(new Employee(2L, "Diwas Sedai", "IN4")));
		};
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner setup(ToDoRepository toDoRepository) {
		return (args) -> {
			toDoRepository.save(new ToDo("Add a new test case", true));
			toDoRepository.save(new ToDo("Make it fail", true));
			toDoRepository.save(new ToDo("Do changes to the code", false));
			toDoRepository.save(new ToDo("Pass the test", true));
		};
	}*/
}

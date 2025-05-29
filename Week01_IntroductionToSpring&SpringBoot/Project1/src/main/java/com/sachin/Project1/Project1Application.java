package com.sachin.Project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {

	@Autowired
	Apple obj;
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
		context.close();

	}


	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}
}

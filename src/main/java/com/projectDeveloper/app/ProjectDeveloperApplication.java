package com.projectDeveloper.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.projectDeveloper.app")
public class ProjectDeveloperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDeveloperApplication.class, args);
	}

}

package com.softpager.cmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CoursesManagement {

	public static void main(String[] args) {
		SpringApplication.run(CoursesManagement.class, args);
	}
}

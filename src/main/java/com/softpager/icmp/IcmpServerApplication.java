package com.softpager.icmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IcmpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcmpServerApplication.class, args);
	}

}


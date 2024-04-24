package com.roulette.roulette;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication()
@EnableJpaAuditing
public class RouletteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouletteApplication.class, args);
	}

}

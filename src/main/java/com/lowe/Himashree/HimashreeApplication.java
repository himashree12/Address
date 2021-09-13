package com.lowe.Himashree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.lowe.Himashree.AddressRepository")
public class HimashreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HimashreeApplication.class, args);
	}

}

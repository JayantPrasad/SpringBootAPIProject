package com.prasadJayant.SpringBootRestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.prasadJayant"})
@org.springframework.boot.persistence.autoconfigure.EntityScan(basePackages = {"com.prasadJayant.controller"})
@EnableJpaRepositories(basePackages = {"com.prasadJayant.repo"})
public class SpringBootRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceApplication.class, args);
	}

}
package com.springboot.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.dashboard.entity")
@EnableJpaRepositories(basePackages = "com.springboot.dashboard.repository")
public class SpringbootDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDashboardApplication.class, args);
	}

}

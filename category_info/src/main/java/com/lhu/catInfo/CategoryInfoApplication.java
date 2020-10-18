package com.lhu.catInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CategoryInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryInfoApplication.class, args);
	}

}

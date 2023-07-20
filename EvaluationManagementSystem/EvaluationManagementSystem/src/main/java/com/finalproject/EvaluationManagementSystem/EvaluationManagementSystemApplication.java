package com.finalproject.EvaluationManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EvaluationManagementSystemApplication implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:5174") // Replace with your frontend origin
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
				.allowCredentials(true);
	}

	public static void main(String[] args) {
		SpringApplication.run(EvaluationManagementSystemApplication.class, args);
	}

}

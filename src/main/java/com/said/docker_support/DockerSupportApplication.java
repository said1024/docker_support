package com.said.docker_support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSupportApplication.class, args);
		System.out.println("docker compose support 0");
	}

}

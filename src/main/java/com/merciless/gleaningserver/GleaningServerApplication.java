package com.merciless.gleaningserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GleaningServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GleaningServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world");
	}

}

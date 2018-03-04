package com.ilovebambi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb2sApplication implements CommandLineRunner {

	private static  final Logger LOGGER = LoggerFactory.getLogger(Sb2sApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Sb2sApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("hello world");
	}
}

package com.example.filmaffinity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmaffinityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmaffinityApplication.class, args);
	}
	@Bean
	CommandLineRunner ponPeliculas(){
		return args -> {

		};
	}
}

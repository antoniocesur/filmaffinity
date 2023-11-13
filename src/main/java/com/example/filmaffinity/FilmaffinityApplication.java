package com.example.filmaffinity;

import com.example.filmaffinity.modelo.Pelicula;
import com.example.filmaffinity.repositorios.RepositorioPeliculas;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Locale;

@SpringBootApplication
public class FilmaffinityApplication {
	@Autowired
	RepositorioPeliculas repositorioPeliculas;

	public static void main(String[] args) {
		SpringApplication.run(FilmaffinityApplication.class, args);
	}
	@Bean
	CommandLineRunner ponPeliculas(){
		return args -> {

			Faker faker = new Faker(new Locale("es-ES"));
			if(repositorioPeliculas.findAll().size()<5) {
				for (int i = 0; i < 5; i++) {
					Pelicula p = new Pelicula();
					p.setTitulo(faker.book().title());
					p.setResumen(faker.chuckNorris().fact());
					p.setFecha(LocalDate.now());
					p.setNacionalidad(faker.country().countryCode2());
					repositorioPeliculas.save(p);
				}
			}
		};
	}
}

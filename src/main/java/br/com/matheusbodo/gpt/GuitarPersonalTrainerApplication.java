package br.com.matheusbodo.gpt;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GuitarPersonalTrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuitarPersonalTrainerApplication.class, args);
	}
	
	@Bean
	public Random random() {
		return new Random();
	}
}

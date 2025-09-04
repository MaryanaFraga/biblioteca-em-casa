package com.example.biblioteca_em_casa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BibliotecaEmCasaApplication {
	@GetMapping("/minha-biblioteca")
	public String bem_vindo(){
		return "Bem-Vindo(a)";
	}
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaEmCasaApplication.class, args);
	}

}

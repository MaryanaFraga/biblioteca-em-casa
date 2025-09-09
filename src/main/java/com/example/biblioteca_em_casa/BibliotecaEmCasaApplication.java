package com.example.biblioteca_em_casa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BibliotecaEmCasaApplication {
    public static void main(String[] args) {
		SpringApplication.run(BibliotecaEmCasaApplication.class, args);
	}
}
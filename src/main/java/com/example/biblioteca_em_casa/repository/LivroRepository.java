package com.example.biblioteca_em_casa.repository;

import com.example.biblioteca_em_casa.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <Livro, String>{
}

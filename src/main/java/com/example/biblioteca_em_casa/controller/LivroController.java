package com.example.biblioteca_em_casa.controller;

import com.example.biblioteca_em_casa.model.Livro;
import com.example.biblioteca_em_casa.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @PatchMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Livro novoLivro){
        Livro livro = livroRepository.findById(id).orElse(null);

        if(livro == null){
            System.out.println("Livro não encontrado");
            return;
        }

        if(novoLivro.getTitulo() != null)
            livro.setTitulo(novoLivro.getTitulo());
        if(novoLivro.getAutor() != null)
            livro.setAutor(novoLivro.getAutor());
        if(novoLivro.getGenero() != null)
            livro.setGenero(novoLivro.getGenero());

        livroRepository.save(livro);

        System.out.println("Livro atualizado " + livro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        livroRepository.deleteById(id);
    }

    @GetMapping
    public List<Livro> listarTodos(){
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livro listarPorID(@PathVariable("id") String id){
        return livroRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void cadastrar(@RequestBody Livro livro) {
        String id = UUID.randomUUID().toString();
        livro.setId(id);
        livroRepository.save(livro);

        System.out.println("Livro cadastrado " + livro);
    }
}

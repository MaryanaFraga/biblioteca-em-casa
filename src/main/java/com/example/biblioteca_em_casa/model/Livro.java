package com.example.biblioteca_em_casa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Livro")
public class Livro {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "genero", nullable = false)
    private String genero;

    // Get
    public String getTitulo() { return titulo; }

    public String getId() { return id; }

    public String getAutor() { return autor; }

    public String getGenero() { return genero; }

    //Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

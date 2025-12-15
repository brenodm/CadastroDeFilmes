package dev.Java10x.Cadastro.de.Filmes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_filmes")
public class FilmesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;
    private Double nota;

    public FilmesEntity() {
    }

    public FilmesEntity(Long id, String nome, CategoriaEntity categoria, Double nota) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

}

package dev.Java10x.Cadastro.de.Filmes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<FilmesEntity> filmes;

    public CategoriaEntity() {
    }

    public CategoriaEntity(Long id, String nome, List<FilmesEntity> filmes) {
        this.id = id;
        this.nome = nome;
        this.filmes = filmes;
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

    public FilmesEntity getFilmes() {
        return filmes;
    }

    public void setFilmes(FilmesEntity filmes) {
        this.filmes = filmes;
    }

}

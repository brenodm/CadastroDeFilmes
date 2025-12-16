package dev.Java10x.Cadastro.de.Filmes.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_filmes")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class FilmesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;
    private Double nota;


}

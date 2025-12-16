package dev.Java10x.Cadastro.de.Filmes.repository;

import dev.Java10x.Cadastro.de.Filmes.entity.FilmesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesRepository extends JpaRepository<FilmesEntity, Long> {

}

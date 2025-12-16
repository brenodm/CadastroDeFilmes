package dev.Java10x.Cadastro.de.Filmes.repository;

import dev.Java10x.Cadastro.de.Filmes.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<CategoriaEntity, Long> {


}

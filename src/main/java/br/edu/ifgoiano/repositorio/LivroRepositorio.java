package br.edu.ifgoiano.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifgoiano.entidade.Livro;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long>{

}

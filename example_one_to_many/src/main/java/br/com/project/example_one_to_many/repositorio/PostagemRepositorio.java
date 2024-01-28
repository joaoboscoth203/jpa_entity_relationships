package br.com.project.example_one_to_many.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.example_one_to_many.modelo.Postagem;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem, Long> {
    
}

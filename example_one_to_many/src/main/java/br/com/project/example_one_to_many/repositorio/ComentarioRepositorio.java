package br.com.project.example_one_to_many.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.example_one_to_many.modelo.Comentario;

@Repository
public interface ComentarioRepositorio extends CrudRepository<Comentario, Long>{
    
}

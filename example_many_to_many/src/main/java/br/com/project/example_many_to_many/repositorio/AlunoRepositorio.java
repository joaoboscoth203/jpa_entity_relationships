package br.com.project.example_many_to_many.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.example_many_to_many.modelo.Aluno;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Long>{
    
}
